package Demos;

import java.util.Scanner;

public class Demo_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsCount = Integer.parseInt(scanner.nextLine());
        int columnsCount = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.next().charAt(0);

        for (int i = 1; i <= rowsCount; i++) {
            for (int j = 1; j <= columnsCount ; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
