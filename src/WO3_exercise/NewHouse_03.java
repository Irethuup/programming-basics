package WO3_exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int amountOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;
        //double lackOfMoney = 0;

        if ("Roses".equals(flowers)) {
            finalPrice = amountOfFlowers * 5;
            if (amountOfFlowers > 80) {
                finalPrice = finalPrice * 0.9;
            }
        } else if ("Dahlias".equals(flowers)) {
            finalPrice = amountOfFlowers * 3.80;
            if (amountOfFlowers > 90) {
                finalPrice = finalPrice * 0.85;
            }
        } else if ("Tulips".equals(flowers)) {
            finalPrice = amountOfFlowers * 2.80;
            if (amountOfFlowers > 80) {
                finalPrice = finalPrice * 0.85;
            }
        } else if ("Narcissus".equals(flowers)) {
            finalPrice = amountOfFlowers * 3;
            if (amountOfFlowers < 120) {
                finalPrice = finalPrice * 1.15;
            }
        } else if ("Gladiolus".equals(flowers)) {
            finalPrice = amountOfFlowers * 2.5;
            if (amountOfFlowers < 80) {
                finalPrice = finalPrice * 1.20;
            }
        }


            double diff = budget - finalPrice;

            if (budget >= finalPrice) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountOfFlowers, flowers, diff);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(diff));
            }
        }
    }