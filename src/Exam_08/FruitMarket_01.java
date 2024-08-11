package Exam_08;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        //2.	Количество на бананите в килограми – реално число в интервала [0.00 … 1 0000.00]
        //3.	Количество на портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        //4.	Количество на малините в килограми – реално число в интервала [0.00 … 10000.00]
        //5.	Количество на ягодите в килограми – реално число в интервала [0.00 … 10000.00]

        double priceOfStrawberries = Double.parseDouble(scanner.nextLine());
        double amountOfbananasInKg = Double.parseDouble(scanner.nextLine());
        double amountOfOrangesInKg = Double.parseDouble(scanner.nextLine());
        double amountOfRaspberriesInKg = Double.parseDouble(scanner.nextLine());
        double amountOfStrawberriesInKg = Double.parseDouble(scanner.nextLine());

        double priceOfRaspberries = priceOfStrawberries / 2;
        double priceOfOranges = priceOfRaspberries - (0.4 * priceOfRaspberries);
        double priceOfBananas = priceOfRaspberries - (0.8 * priceOfRaspberries);

        double totalSum = priceOfStrawberries * amountOfStrawberriesInKg
                + priceOfBananas * amountOfbananasInKg
                + priceOfOranges * amountOfOrangesInKg
                + priceOfRaspberries * amountOfRaspberriesInKg;
        System.out.printf("%.2f", totalSum);

    }
}
