package WO3_exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPricePerNight = 0;
        double apartmentPricePerNight = 0;

        switch (month) {
            case "May":
            case "October":
                studioPricePerNight = 50;
                apartmentPricePerNight = 65;
                if (nights > 14) {
                    //The multiplication assignment ( *= ) operator performs multiplication on the two operands
                    //and assigns the result to the left operand.
                    studioPricePerNight *= 0.7; // 30% намаление
                } else if (nights > 7) {
                    studioPricePerNight *= 0.95; // 5% намаление
                }
                break;
            case "June":
            case "September":
                studioPricePerNight = 75.20;
                apartmentPricePerNight = 68.70;
                if (nights > 14) {
                    studioPricePerNight *= 0.8; // 20% намаление
                }
                break;
            case "July":
            case "August":
                studioPricePerNight = 76;
                apartmentPricePerNight = 77;
                break;
            default:
                System.out.println("Невалиден месец!");
                return;
        }
        if (nights > 14) {
            apartmentPricePerNight *= 0.9; // 10% намаление
        }

        // Изчисляване на общата цена за престоя
        double totalStudioPrice = studioPricePerNight * nights;
        double totalApartmentPrice = apartmentPricePerNight * nights;

        System.out.printf("Apartment: %.2f lv.%n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.%n", totalStudioPrice);
    }
}
