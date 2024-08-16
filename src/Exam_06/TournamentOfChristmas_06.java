package Exam_06;

import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
        //До получаване на командата "Finish" се чете:
        //•	Спорт  – текст
        //За всеки спорт се прочита:
        //o	Резултат  – текст с възможности: "win" или "lose"

        int daysOfTournament = Integer.parseInt(scanner.nextLine());
        int totalWins = 0;
        int totalLosses = 0;

        double totalMoney = 0;
        for (int day = 1; day <= daysOfTournament; day++) {
            double profit = 0;
            int dailyWins = 0;
            int dailyLosses = 0;

            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    profit += 20;
                    //Получаваме команда Finish и игрите за деня приключват.
                    dailyWins++;
                } else if (result.equals("lose")) {
                    dailyLosses++;
                }

                sport = scanner.nextLine();
            }
            if (dailyWins > dailyLosses) {
                // 10% uvelichenie
                profit *= 1.10;
            }
            totalMoney += profit;
            totalWins += dailyWins;
            totalLosses += dailyLosses;
        }

        if (totalWins > totalLosses) {
            //Тъй като имаме повече победи, отколкото загуби, печелим турнира и увеличаваме парите с 20%
            totalMoney *= 1.20;
            //•	Ако сте спечелили турнира:
            //     	"You won the tournament! Total raised money: {спечелените пари}"
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            //•	Ако сте загубили на турнира:
            //"You lost the tournament! Total raised money: {спечелените пари}"
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}
