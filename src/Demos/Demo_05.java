package Demos;

import java.util.Scanner;

public class Demo_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 1001; i++) {

            if (i % 2 != 0) {
                System.out.print(i + "*" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int number = 1;
        while (number <= 1001) {
            if (number % 2 != 0) {
                System.out.print(number + "*" + " ");
            } else {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
