package Exam_07;

import java.util.Scanner;

public class BestPLayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int mostGoals = 0;

        while (true) {
            String playerName = scanner.nextLine();
            if (playerName.equals("END")) {
                break;
            }
            int goalsScored = Integer.parseInt(scanner.nextLine());

            if (goalsScored > mostGoals) {
                bestPlayer = playerName;
                mostGoals = goalsScored;
            }

            if (goalsScored >= 10) {
                break;
            }
        }

        System.out.println(bestPlayer + " is the best player!");

        if (mostGoals >= 3) {
            System.out.println("He has scored " + mostGoals + " goals and made a hat-trick !!!");
        } else {
            System.out.println("He has scored " + mostGoals + " goals.");
        }

    }
}
