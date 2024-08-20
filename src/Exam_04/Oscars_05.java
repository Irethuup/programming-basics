package Exam_04;

import java.util.Scanner;

public class Oscars_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startingPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < juryCount; i++) {
            String judgeName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            startingPoints = startingPoints + (judgeName.length() * points / 2);

            if (startingPoints > 1250.5) {
                break;
            }
        }

        if (startingPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                    actorName , startingPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!",
                    actorName , 1250.5 - startingPoints);
        }

    }
}
