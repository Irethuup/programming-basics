package ForLoop;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String text = scanner.nextLine();
       int sum = 0;

       for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            // a = 1;
            // e = 2;
            // i = 3;
            // o = 4;
            // u = 5;

            switch (symbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
