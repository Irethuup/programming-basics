package Exam_06;

import java.util.Scanner;

public class ChangeBureau_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //• 1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева

        //От конзолата се четат 3 числа:
        //•	На първия ред – броят биткойни. Цяло число в интервала [0…20]
        //•	На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
        //•	На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]

        int amountBitcoins = Integer.parseInt(scanner.nextLine());
        double yoanAmount = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinBGN = amountBitcoins * 1168;
        double yuanDollars = yoanAmount * 0.15;
        double dollarsBGN = yuanDollars * 1.76;

        double euros = (bitcoinBGN + dollarsBGN) / 1.95;
        double commissionValue = euros * (commission / 100);

        System.out.printf("%.2f", euros - commissionValue);

    }
}
