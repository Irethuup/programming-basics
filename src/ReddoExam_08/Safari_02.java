package ReddoExam_08;

import java.util.Scanner;

public class Safari_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  От конзолата се четат 3 реда:
//•	Бюджет – реално число в интервала [0.00… 10000.00]
//•	Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
//•	Ден от седмицата – текст с възможности "Saturday" и "Sunday"

        double budget = Double.parseDouble(scanner.nextLine());
        double littersOfGasNeeded = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double gasPrice = 0;
        double tourGuide = 0;
        double totalSum = 0;
        if ("Saturday".equals(day)) {
            gasPrice = littersOfGasNeeded * 2.10;
            tourGuide = gasPrice + 100;
            totalSum = tourGuide - (tourGuide * 0.1);
        } else if ("Sunday".equals(day)) {
            gasPrice = littersOfGasNeeded * 2.10;
            tourGuide = gasPrice + 100;
            totalSum = tourGuide - (tourGuide * 0.2);
        }

        double diff = budget - totalSum;
        if (budget > totalSum) {
            System.out.printf("Safari time! Money left: %.2f lv. ", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(diff));
        }

    }
}
