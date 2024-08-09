package WO3_exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double shipPrice = 0;

        switch (season) {

            case "Spring":
                shipPrice = 3000;
                break;

            case "Summer":
            case "Autumn":
                shipPrice = 4200;
                break;

            case "Winter":
                shipPrice = 2600;
                break;
        }

        if (fisherman <= 6) {

            shipPrice = shipPrice * 0.90;

        } else if (fisherman <= 11) {

            shipPrice = shipPrice * 0.85;

        } else {

            shipPrice = shipPrice * 0.75;

        }

        if (fisherman % 2 == 0 && !season.equals("Autumn")) {

            shipPrice = shipPrice * 0.95;

        }

        if (budget >= shipPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - shipPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", shipPrice - budget);
        }
    }
}
