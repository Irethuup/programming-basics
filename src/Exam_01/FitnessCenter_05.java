package Exam_01;

import java.util.Scanner;

public class FitnessCenter_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        int training = 0;
        int shopping = 0;

        for (int i = 0; i < visitors; i++) {
            String activity = scanner.nextLine();
            if ("Back".equals(activity)) {
                back++;
                training++;
            } else if ("Chest".equals(activity)) {
                chest++;
                training++;
            } else if ("Legs".equals(activity)) {
                legs++;
                training++;
            } else if ("Abs".equals(activity)) {
                abs++;
                training++;
            } else if ("Protein shake".equals(activity)) {
                proteinShake++;
                shopping++;
            } else if ("Protein bar".equals(activity)) {
                proteinBar++;
                shopping++;
            }
        }
        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", (training * 1.0 / (training + shopping)) * 100);
        System.out.printf("%.2f%% - protein%n", (shopping * 1.0 / (training + shopping)) * 100);


    }
}
