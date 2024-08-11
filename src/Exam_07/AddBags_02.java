package Exam_07;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
        //2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
        //3.	Дни до пътуването – цяло число в диапазона [1…60]
        //4.	Брой багажи – цяло число в диапазона [1…10]

        double priceOver20Kg = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int daysUntilFlight = Integer.parseInt(scanner.nextLine());
        int numberOfBags = Integer.parseInt(scanner.nextLine());

        double luggagePrice = 0;

        if (luggageWeight < 10) {
            luggagePrice = 0.2 * priceOver20Kg;
        } else if (luggageWeight <= 20) {
            luggagePrice = 0.5 * priceOver20Kg;
        } else {
            luggagePrice = priceOver20Kg;
        }

        //uvelichavame cenata na poleta
        if (daysUntilFlight > 30) {
            luggagePrice *= 1.1; // Increase by 10%
        } else if (daysUntilFlight >= 7) {
            luggagePrice *= 1.15; // Increase by 15%
        } else {
            luggagePrice *= 1.4; // Increase by 40%
        }

        double totalPrice = luggagePrice * numberOfBags;
        System.out.printf("The total price of bags is: %.2f lv.%n", totalPrice);

    }
}
