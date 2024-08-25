package Exam_03;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално от конзолата се прочита броя на козунаците – цяло число в интервала [1… 100]
        //След това за всеки козунак се прочита:
        //•	Името на пекаря, който е направил козунака – текст
        //•	До получаване на командата "Stop" се прочита
        //o	оценка за козунак от един човек  – цяло число в интервала [1... 10]

        int participants = Integer.parseInt(scanner.nextLine());
        String bestBaker = "";
        double highestPoints = 0;
        for (int i = 0; i < participants; i++) {
            double gradeTotal = 0;
            String bakerName = scanner.nextLine();
            while (true) {
                String gradeStr = scanner.nextLine();
                if ("Stop".equals(gradeStr)) {
                    break;
                }
                double grade = Double.parseDouble(gradeStr);
                gradeTotal += grade;
            }
            System.out.printf("%s has %.0f points.%n", bakerName, gradeTotal);
            if (gradeTotal > highestPoints) {
                highestPoints = gradeTotal;
                bestBaker = bakerName;
                System.out.printf("%s is the new number 1!%n", bakerName);
            }
        }
        System.out.printf("%s won competition with %.0f points!%n", bestBaker, highestPoints);
    }

}
