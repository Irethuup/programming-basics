package Exam_04;

import java.util.Scanner;

public class Serials_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int serialCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < serialCount; i++) {
            String serialName = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (serialName) {
                case "Thrones":
                    price *= 0.5;
                    break;
                case "Lucifer":
                    price *= 0.6;
                    break;
                case "Protector":
                    price *= 0.7;
                    break;
                case "TotalDrama":
                    price *= 0.8;
                    break;
                case "Area":
                    price *= 0.9;
                    break;
            }
            budget -= price;
        }
        if (budget < 0) {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        } else {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        }

    }
}
