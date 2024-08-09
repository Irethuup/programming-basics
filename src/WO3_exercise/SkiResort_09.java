package WO3_exercise;

import java.util.Scanner;

public class SkiResort_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        int nights = days - 1;

        double roomForOnePersonRate = 18.00;
        double apartmentRate = 25.00;
        double presidentApartmentRate = 35.00;

        double basePrice = 0.0;

        if (roomType.equals("room for one person")) {
            basePrice = nights * roomForOnePersonRate;
        } else if (roomType.equals("apartment")) {
            basePrice = nights * apartmentRate;
        } else if (roomType.equals("president apartment")) {
            basePrice = nights * presidentApartmentRate;
        }

        // apply discounts based on the room type and number of nights

        double discount = 0.0;
        if (roomType.equals("apartment")) {
            if (nights < 10) {
                discount = 0.30;
            } else if (nights <= 15) {
                discount = 0.35;
            } else {
                discount = 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            if (nights < 10) {
                discount = 0.10;
            } else if (nights <= 15) {
                discount = 0.15;
            } else {
                discount = 0.20;
            }
        }

        double finalPrice = basePrice * (1 - discount);


        //feedback adjustment

        if (feedback.equals("positive")) {
            finalPrice *= 1.25;
        } else if (feedback.equals("negative")) {
            finalPrice *= 0.90;
        }

     //final price
        System.out.printf("%.2f%n", finalPrice);

    }
}
