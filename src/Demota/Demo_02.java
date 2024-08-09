package Demota;

import java.util.Scanner;

public class Demo_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("Stop")){
            System.out.println("Enter word");
            word = scanner.nextLine();
        }

    }
}
