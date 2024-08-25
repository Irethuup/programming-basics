package Exam;

import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално от конзолата се прочита едно число – брой локации – цяло число в интервала [1.. 100]
        //За всяка една локация се четат две числа, по едно на ред:
        //1.	На първия ред – очакван среден добив на ден злато – реално число в интервала [0.00.. 10000.00]
        //2.	На втория ред – брой дни, в който ще се копае на дадената локация – цяло число в интервала [1.. 30]

        //За всеки ден се чете по едно число:
        //•	Добито злато за деня – реално число в интервала [0.00.. 1000.00]

        int locationsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locationsCount; i++) {
            double expectedAverageGold = Double.parseDouble(scanner.nextLine());
            int daysCount = Integer.parseInt(scanner.nextLine());

            double totalGold = 0;

            for (int j = 0; j < daysCount; j++) {
                double dailyGold = Double.parseDouble(scanner.nextLine());
                totalGold += dailyGold;
            }

            double averageGoldPerDay = totalGold / daysCount;

            if (averageGoldPerDay >= expectedAverageGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            } else {
                double goldNeeded = expectedAverageGold - averageGoldPerDay;
                System.out.printf("You need %.2f gold.%n", goldNeeded);
            }
        }

    }
}
