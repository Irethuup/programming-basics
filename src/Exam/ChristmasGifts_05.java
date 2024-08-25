package Exam;

import java.util.Scanner;

public class ChristmasGifts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат поредица от редове до получаване на команда "Christmas":
        //•	Годините на всеки член от семейството - цяло число в интервала [1 … 130]

        //•	Всички до 16 (вкл.) години се считат за деца и ще получат играчка
        //•	Всички над 16 години се считат за възрастни и ще получат коледен пуловер
        //•	Цената на всяка играчка е 5 лв., а цената на един пуловер е 15 лв.

        int kidsCount = 0;
        int adultsCount = 0;
        int toyPrice = 5;
        int sweaterPrice = 15;

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Christmas")) {
                break;
            }

            int age = Integer.parseInt(command);
            if (age <= 16) {
                kidsCount++;
            } else {
                adultsCount++;
            }
        }

        int moneyForToys = kidsCount * toyPrice;
        int moneyForSweaters = adultsCount * sweaterPrice;

        System.out.printf("Number of adults: %d%n", adultsCount);
        System.out.printf("Number of kids: %d%n", kidsCount);
        System.out.printf("Money for toys: %d%n", moneyForToys);
        System.out.printf("Money for sweaters: %d%n", moneyForSweaters);
    }
}
