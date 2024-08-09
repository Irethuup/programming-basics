package Demos;

import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "200";
        int number = Integer.parseInt(text);
        System.out.println();


        int start = 5;
        int end = 10;

        for (int i = start; i <= end; i += 4 ) {
            System.out.println(i);
        }

        int buba = 0;
        while (buba < 10){
            System.out.println(buba);
            buba += 4;
        }

    }
}
