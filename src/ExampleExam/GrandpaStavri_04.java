package ExampleExam;

import java.util.Scanner;

public class GrandpaStavri_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат:
        //•	На първия ред – N – броят дни  – цяло число в интервала [1...300]
        //•	За всеки един ден на отделен ред:
        //	количество на ракията – реално число в интервала [1.00...500.00]
        //	градус на получената напитка - реално число в интервала [10.00...99.00]

        int n = Integer.parseInt(scanner.nextLine());

        double totalLiters = 0;
        double totalDegrees = 0;
        for (int i = 0; i < n; i++) {
            // Количество на ракията
            double quantity = scanner.nextDouble();
            // Градус на ракията
            double degrees = scanner.nextDouble();

            totalLiters += quantity; // Общо количество литри
            totalDegrees += quantity * degrees;
        }
        double averageDegrees = totalDegrees / totalLiters;
        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", averageDegrees);
        if (averageDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegrees <= 42) {
            System.out.println("Super!");
        } else if (averageDegrees > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
