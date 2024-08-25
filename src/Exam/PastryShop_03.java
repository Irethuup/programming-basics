package Exam;

import java.util.Scanner;

public class PastryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        //1.	Сладкиш - текст - "Cake", "Souffle" или "Baklava"
        //2.	Брой на поръчаните сладкиши - цяло число в интервала [1 … 10000]
        //3.	Ден от месец декември преди Коледа - цяло число в интервала [1 … 24]

        String sweetType = scanner.nextLine();
        int sweetCount = Integer.parseInt(scanner.nextLine());
        int dayOfDecember = Integer.parseInt(scanner.nextLine());

        double pricePerUnit = 0.0;

        if (dayOfDecember <= 15) {
            switch (sweetType) {
                case "Cake":
                    pricePerUnit = 24.00;
                    break;
                case "Souffle":
                    pricePerUnit = 6.66;
                    break;
                case "Baklava":
                    pricePerUnit = 12.60;
                    break;
            }
        } else {
            switch (sweetType) {
                case "Cake":
                    pricePerUnit = 28.70;
                    break;
                case "Souffle":
                    pricePerUnit = 9.80;
                    break;
                case "Baklava":
                    pricePerUnit = 16.98;
                    break;
            }
        }

        double totalPrice = pricePerUnit * sweetCount;

        if (dayOfDecember <= 22) {
            if (totalPrice >= 100 && totalPrice <= 200) {
                totalPrice *= 0.85; // 15% отстъпка
            } else if (totalPrice > 200) {
                totalPrice *= 0.75; // 25% отстъпка
            }
        }

        if (dayOfDecember <= 15) {
            totalPrice *= 0.90;
        }
        System.out.printf("%.2f%n", totalPrice);
    }
}
