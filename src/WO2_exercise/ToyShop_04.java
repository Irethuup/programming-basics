package WO2_exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2.	Брой пъзели - цяло число в интервала [0… 1000]
        //3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5.	Брой миньони - цяло число в интервала [0 … 1000]
        //6.	Брой камиончета - цяло число в интервала [0 … 1000]

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCounts = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int plushBears = Integer.parseInt(scanner.nextLine());
        int minionCounts = Integer.parseInt(scanner.nextLine());
        int truckCounts = Integer.parseInt(scanner.nextLine());
        
        double totalSum = 2.60 * puzzleCounts + 3 * talkingDolls + 4.10 * plushBears + 8.20 * minionCounts + truckCounts * 2;
        int toysCounts = puzzleCounts + talkingDolls + plushBears + minionCounts + truckCounts;
        double discountPrice = totalSum;
        
        if (toysCounts >= 50){
            double discount = totalSum * 0.25;
            discountPrice = totalSum - discount;
        }

        double rent = discountPrice * 0.10;
        double profit = discountPrice - rent;
        double difference = Math.abs(profit - vacationPrice);

        if (profit >= vacationPrice) {
            System.out.printf ("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed", difference);
        }
    }
}
