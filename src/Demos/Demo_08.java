package Demos;

import java.util.Scanner;

public class Demo_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsCount = Integer.parseInt(scanner.nextLine());
        int columnsCount = Integer.parseInt(scanner.nextLine());

        int min = 10;
        int max = 99;
        for (int i = 1; i <= rowsCount; i++) {
            for (int j = 1; j <= columnsCount; j++) {
                int random = min + (int) ((max - min + 1) * Math.random());

                if (random % 2 == 0) {
                    System.out.print(random + " ");
                } else {
                    System.out.print("XX ");
                }
            }
            System.out.println();
        }

    }
}
