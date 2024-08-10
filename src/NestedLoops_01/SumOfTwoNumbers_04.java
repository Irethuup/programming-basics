package NestedLoops_01;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първи ред – начало на интервала – цяло число в интервала [1...999]
        // • Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        // • Трети ред – магическото число – цяло число в интервала [1...10000]

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isFound = false;
        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                count++;
                int sum = i + j;

                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
