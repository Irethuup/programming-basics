package Demos;

import java.util.Scanner;

public class Demo_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String result = "";
        while (!"END".equals(text)) {
            result += text + "*";
            text = scanner.nextLine();
        }
        System.out.print(result);

    }
}
