package W01_exercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пакет химикали - 5.80 лв.
        //Пакет маркери - 7.20 лв.
        //Препарат - 1.20 лв (за литър)

        //Брой пакети химикали - цяло число в интервала [0...100]
        // Брой пакети маркери - цяло число в интервала [0...100]
        // Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        // Процент намаление - цяло число в интервала [0...100]

        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        // Цена на пакетите химикали => 2 * 5.80 = 11.60 лв.

        double pensCost = countPens * 5.80;
        double markerCost = countMarkers * 7.20;
        double cleanCost = liters * 1.20;

        double sum = (pensCost + markerCost + cleanCost) * (1 - percent / 100.0);

        System.out.println(sum);

    }
}
