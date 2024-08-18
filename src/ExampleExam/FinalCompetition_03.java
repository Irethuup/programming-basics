package ExampleExam;

import java.util.Scanner;

public class FinalCompetition_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        //1.	Брой танцьори – цяло число в интервала [1 … 10]
        //2.	Брой точки – реално число в интервала [1.00 … 10000.00]
        //3.	Сезон –  текст със следните възможности - "summer" или "winter"
        //4.	Място – текст със следните възможности - "Bulgaria" или "Abroad"

        int amountOfDancers = Integer.parseInt(scanner.nextLine());
        double amountOfPoints = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        //зависи от: държавата, в която се е провело състезанието;
        // броя точки, които журито е дало и сезонът, през който се е провело състезанието.

        double cashPrize = 0;
        double expensesPercentage = 0;

        if ("Bulgaria".equals(place)) {
            cashPrize = amountOfPoints * amountOfDancers;
            if ("summer".equals(season)) {
                expensesPercentage = 0.05; // 5%
            } else if ("winter".equals(season)) {
                expensesPercentage = 0.08; // 8%
            }
        } else if ("Abroad".equals(place)) {
            cashPrize = amountOfPoints * amountOfDancers * 1.5; // 50% extra
            if ("summer".equals(season)) {
                expensesPercentage = 0.10; // 10%
            } else if ("winter".equals(season)) {
                expensesPercentage = 0.15; // 15%
            }
        }

        double expenses = cashPrize * expensesPercentage;
        double netPrize = cashPrize - expenses;
        // 75% donation
        double donation = netPrize * 0.75;
        double leftMoney = netPrize - donation;
        double moneyPerDancer = leftMoney / amountOfDancers;

        //На конзолата се отпечатват 2 реда:
        //•	Сумата, която са дали за благотворителност
        //"Charity - {сума за благотворителност}"
        //•	Сумата, която е получил всеки танцьор
        //"Money per dancer - {сума за танцьор}"
        //Сумите да бъдат форматирани до втория знак след десетичната запетая

        System.out.printf("Charity - %.2f%n", donation);
        System.out.printf("Money per dancer - %.2f%n", moneyPerDancer);
    }
}
