package ForLoop_exercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int facebookPenalty = 150;
        int instagramPenalty = 100;
        int redditPenalty = 50;

        boolean lostSalary = false;

        for (int i = 0; i < n; i++) {
            String websiteName = scanner.nextLine();

            switch (websiteName) {
                case "Facebook":
                    salary -= facebookPenalty;
                    break;
                case "Instagram":
                    salary -= instagramPenalty;
                    break;
                case "Reddit":
                    salary -= redditPenalty;
                    break;
                default:
                    // no penalty for other websites so we exit the switch case
                    break;
            }

            if (salary <= 0) {
                lostSalary = true;
                // exit the loop if salary is lost
                break;
            }
        }

        if (lostSalary) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }

    }
}
