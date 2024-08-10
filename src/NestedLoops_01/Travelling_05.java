package NestedLoops_01;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double excursionPrice = Double.parseDouble(scanner.nextLine());

            double availableMoney = 0;
            while (availableMoney < excursionPrice) {
                double saveMoney = Double.parseDouble(scanner.nextLine());
                availableMoney += saveMoney;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
