package Exam;

import java.util.Scanner;

public class CatFood_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първи ред - броят на котките - цяло число в интервала [1..100]
        //•	На всеки следващ ред за всяка котка - Х грама храна - реално число в интервала [100.00..400.00]

        int catsAmount = Integer.parseInt(scanner.nextLine());

        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        double totalFoodGrams = 0;

        for (int i = 0; i < catsAmount; i++) {
            double foodGrams = Double.parseDouble(scanner.nextLine());
            totalFoodGrams += foodGrams;
            if (foodGrams >= 100 && foodGrams < 200) {
                smallCats++;
            } else if (foodGrams >= 200 && foodGrams < 300) {
                bigCats++;
            } else if (foodGrams >= 300 && foodGrams <= 400) {
                hugeCats++;
            }
        }

        double totalFoodKg = totalFoodGrams / 1000;
        double totalPrice = totalFoodKg * 12.45;
        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", hugeCats);
        System.out.printf("Price for food per day: %.2f lv.%n", totalPrice);

    }
}
