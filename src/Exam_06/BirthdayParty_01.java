package Exam_06;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата

        //•	Наем за залата – реално число в интервала [100.00..10000.00]

        double rentForHall = Double.parseDouble(scanner.nextLine());
        double cakePrice = rentForHall * 0.2;
        double drinkPrice = cakePrice - (cakePrice * 0.45);
        double animator = rentForHall / 3;

        double totalSum = rentForHall + cakePrice + drinkPrice + animator;
        System.out.println(totalSum);


    }
}
