package Demos;

import java.util.Scanner;

public class Demo_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsCount = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.next().charAt(0);

        for (int row = 1; row <= rowsCount; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        for (int row = 1; row <= rowsCount; row++) {
            int col = 1;
            while (col <= row) {
                System.out.print(symbol);
                col++;
            }
            System.out.println();
        }
    }
}
