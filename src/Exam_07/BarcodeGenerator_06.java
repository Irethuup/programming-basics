package Exam_07;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        // 2 3 4 5
        int s1 = start / 1000;
        int temp = (start % 1000);
        int s2 = temp / 100;
        temp = start % 100;
        int s3 = temp / 10;
        int s4 = start % 10;

        // 6 7 8 9
        int d1 = end / 1000;
        temp = (end % 1000);
        int d2 = temp / 100;
        temp = end % 100;
        int d3 = temp / 10;
        int d4 = end % 10;

        while (true) {
            if (s1 % 2 == 0 && s1 < d1) {
                s1++;
            }
            if (s2 % 2 == 0 && s2 < d2) {
                s2++;
            }
            if (s3 % 2 == 0 && s3 < d3) {
                s3++;
            }
            if (s4 % 2 == 0 && s4 < d4) {
                s4++;
            }
            System.out.printf("%d%d%d%d", s1, s2, s3, s4);
        }

    }
}