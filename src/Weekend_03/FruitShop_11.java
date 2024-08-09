package Weekend_03;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isWorkingDay = "Monday".equals(dayOfWeek)
                || "Tuesday".equals(dayOfWeek)
                || "Wednesday".equals(dayOfWeek)
                || "Thursday".equals(dayOfWeek)
                || "Friday".equals(dayOfWeek);

        boolean isWeekend = "Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek);

        boolean isValid = true;
        double price = 0;
        if (isWorkingDay) {
            if ("banana".equals(fruit)) {
                price = 2.50;
            } else if ("apple".equals(fruit)) {
                price = 1.20;
            } else if ("orange".equals(fruit)) {
                price = 0.85;
            } else if ("grapefruit".equals(fruit)) {
                price = 1.45;
            } else if ("kiwi".equals(fruit)) {
                price = 2.70;
            } else if ("pineapple".equals(fruit)) {
                price = 5.50;
            } else if ("grapes".equals(fruit)) {
                price = 3.85;
            } else {
                isValid = false;
            }
        } else if (isWeekend) {
            if ("banana".equals(fruit)) {
                price = 2.70;
            } else if ("apple".equals(fruit)) {
                price = 1.25;
            } else if ("orange".equals(fruit)) {
                price = 0.90;
            } else if ("grapefruit".equals(fruit)) {
                price = 1.60;
            } else if ("kiwi".equals(fruit)) {
                price = 3.00;
            } else if ("pineapple".equals(fruit)) {
                price = 5.60;
            } else if ("grapes".equals(fruit)) {
                price = 4.20;
            }
        } else {
            isValid = false;
        }
        if (isValid) {
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }
    }
}