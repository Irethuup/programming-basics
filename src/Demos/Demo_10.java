package Demos;

import java.util.Scanner;

public class Demo_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = 0;
        int count = 0;
        String n = scanner.nextLine();
        while (!"Stop".equals(n)) {
            int num = Integer.parseInt(n);
            count++;
            totalSum += num;

            n = (scanner.nextLine());
        }
        System.out.println(count);
        System.out.println(totalSum);
    }
}
