package Exam_03;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой козунаци - цяло число в интервала [0 … 99]
        //•	Брой кори с яйца - цяло число в интервала [0 … 99]
        //•	Килограми курабии - цяло число в интервала [0 … 99]

        int cozonacAmount = Integer.parseInt(scanner.nextLine());
        int crusts = Integer.parseInt(scanner.nextLine());
        int cookiesKG = Integer.parseInt(scanner.nextLine());

        double priceOfCozonac = cozonacAmount * 3.20;
        double priceOfEggs = crusts * 4.35;
        double priceOfCookies = cookiesKG * 5.40;
        double priceForEggDye = crusts * 12 * 0.15;
        double totalSum = priceOfCozonac + priceOfEggs + priceOfCookies + priceForEggDye;
        System.out.printf("%.2f", totalSum);
    }
}
