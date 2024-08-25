package Exam_01;

import java.util.Scanner;

public class HighJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът е поредица от цели числа в интервала [100…300]:
        //•	На първия ред се прочита желаната от Тихомир Иванов височина в сантиметри
        //•	На всеки следващ ред до приключване на програмата се прочита височината от скока на Иванов

        int height = Integer.parseInt(scanner.nextLine());
        int staringHeight = height - 30;
        int jumps = 0;
        boolean isFailed = false;

        while (staringHeight <= height) {
            for (int i = 0; i < 3; i++) {
                int currentJum = Integer.parseInt(scanner.nextLine());
                jumps++;
                if (currentJum > staringHeight) {
                    staringHeight += 5;
                    break;
                }
                if (i == 2) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", staringHeight, jumps);
                    isFailed = true;
                }
            }
            if (isFailed) {
                break;
            }
        }
        if (!isFailed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", height, jumps);
        }

    }
}
