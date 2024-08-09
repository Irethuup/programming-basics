package MoreExercises_01;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250;
        double processorsPrice = (videoCardsPrice * 0.35) * processors;
        double ramPrice = (videoCardsPrice * 0.10) * ramMemory;

        double totalPrice = videoCardsPrice + processorsPrice + ramPrice;

        if (videoCards > processors) {
            // totalPrice = totalPrice * 0.85;
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        double diff = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("You have %.2f leva left!",diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}