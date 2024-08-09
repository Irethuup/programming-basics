package WhileLoop_WO4;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBadGrades = Integer.parseInt(scanner.nextLine());

        int failedGrades = 0;
        int countSolved = 0;
        double sumGrades = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedGrades < countBadGrades) {

            String problemName = scanner.nextLine();

            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                failedGrades++;
            }

            sumGrades += grade;
            countSolved++;
            lastProblem = problemName;
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", countBadGrades);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / countSolved);
            System.out.printf("Number of problems: %d%n", countSolved);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
