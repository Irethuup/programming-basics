package ForLoop;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > maxValue) {
                maxValue = number;
            }

            if (number < minValue) {
                minValue = number;
            }
        }

        System.out.printf("Max number: %d%n",maxValue);
        System.out.printf("Min number: %d",minValue);
    }
}
