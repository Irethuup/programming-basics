package Exam_03;

import java.util.Scanner;

public class EasterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата първоначално се чете един ред:
        //•	Брои на клиентите в магазина – цяло число [1… 100]
        //•	След това за всеки един клиент на нов ред до получаване на командата "Finish" се чете:
        //o	Покупката която клиента е избрал – текст ("basket", "wreath" или "chocolate bunny")

        int clientsAmount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 0; i < clientsAmount; i++) {
            double price = 0.0;
            int productCount = 0;
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("Finish")) {
                    break;
                }
                productCount++;
                switch (command) {
                    case "basket":
                        price += 1.50;
                        break;
                    case "wreath":
                        price += 3.80;
                        break;
                    case "chocolate bunny":
                        price += 7;
                        break;
                }
            }
            if (productCount % 2 == 0) {
                double discount = price * 0.2;
                price -= discount;
            }
            totalPrice += price;
            System.out.printf("You purchased %d items for %.2f leva.%n", productCount, price);
        }
        System.out.printf("Average bill per client is: %.2f leva.%n", totalPrice / clientsAmount);

    }
}
