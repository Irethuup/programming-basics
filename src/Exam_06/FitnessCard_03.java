package Exam_06;

import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0;

        if (gender == 'm') {
            switch (sport) {
                case ("Gym"):
                    price = 42;
                    break;
                case ("Boxing"):
                    price = 41;
                    break;
                case ("Yoga"):
                    price = 45;
                    break;
                case ("Zumba"):
                    price = 34;
                    break;
                case ("Dances"):
                    price = 51;
                    break;
                case ("Pilates"):
                    price = 39;
                    break;
                default:
                    System.out.println("invalid sport");
                    return;
            }
        } else if (gender == 'f') {
            switch (sport) {
                case ("Gym"):
                    price = 35;
                    break;
                case ("Boxing"):
                    price = 37;
                    break;
                case ("Yoga"):
                    price = 42;
                    break;
                case ("Zumba"):
                    price = 31;
                    break;
                case ("Dances"):
                    price = 53;
                    break;
                case ("Pilates"):
                    price = 37;
                    break;
                default:
                    System.out.println("invalid sport");
                    return;
            }
        } else {
            System.out.println("Invalid gender");
            return;
        }

        if (age <= 19) {
            price *= 0.8;
        }

        if (budget >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }  else {
            double neededMoney = price - budget;
            System.out.printf("You don't have enough money! You need $%.2f more.", neededMoney);
        }

    }
}
