package ForLoop_exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i = 1; i <= n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());


            if (currentNumber < 200) {
                count1++;
            } else if (currentNumber < 400) {
                count2++;
            } else if (currentNumber < 600) {
                count3++;
            } else if (currentNumber < 800) {
                count4++;
            } else {
                count5++;
            }
        }


        double p1 = (count1 * 1.0 / n) * 100;
        double p2 = (count2 * 1.0 / n) * 100;
        double p3 = (count3 * 1.0 / n) * 100;
        double p4 = (count4 * 1.0 / n) * 100;
        double p5 = (count5 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
