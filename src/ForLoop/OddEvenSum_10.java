package ForLoop;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum = evenSum + number;
            } else {
                oddSum = oddSum + number;
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            int diff = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}