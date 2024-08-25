package Exam_03;

import java.util.Scanner;

public class EasterBake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете 1 ред:
        //•	 Броят на козунаците – цяло число в интервала [1 ... 100]
        //За всеки козунак се чете:
        //o	Количество изразходвана захар (грамове) – цяло число в интервала [1 … 10000]
        //o	Количество изразходвано брашно (грамове) – цяло число в интервала [1 … 10000]

        int cozunacAmount = Integer.parseInt(scanner.nextLine());
        int totalSugar = 0;
        int totalFlour = 0;
        int maxSugar = 0;
        int maxFlour = 0;

        for (int cozunac = 0; cozunac < cozunacAmount; cozunac++) {
            int sugarUsed = Integer.parseInt(scanner.nextLine());
            int flourUsed = Integer.parseInt(scanner.nextLine());

            totalSugar += sugarUsed;
            totalFlour += flourUsed;

            if (sugarUsed > maxSugar) {
                maxSugar = sugarUsed;
            }

            if (flourUsed > maxFlour) {
                maxFlour = flourUsed;
            }
        }

        int sugarPackets = (int) Math.ceil(totalSugar / 950.0);
        int flourPackets = (int) Math.ceil(totalFlour / 750.0);

        System.out.printf("Sugar: %d%n", sugarPackets);
        System.out.printf("Flour: %d%n", flourPackets);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.%n",
                maxFlour, maxSugar);

    }
}
