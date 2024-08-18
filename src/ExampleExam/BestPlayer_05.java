package ExampleExam;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат по два реда до въвеждане на команда "END":
        //•	Име на играч – текст
        //•	Брой вкарани голове  – цяло положително число в интервала [1 … 10000]

        String bestPlayer ="";
        int amountOfGoals = 0;

        while (true) {
            String playerName = scanner.nextLine();
            if (playerName.equals("END")) {
                break;
            }
            int goalsScored = Integer.parseInt(scanner.nextLine());

            if (goalsScored > amountOfGoals) {
                bestPlayer = playerName;
                amountOfGoals = goalsScored;
            }

            if (goalsScored >= 10) {
                break;
            }
        }

        System.out.println(bestPlayer + " is the best player!");

        if (amountOfGoals >= 3) {
            System.out.println("He has scored " + amountOfGoals + " goals and made a hat-trick !!!");
        } else {
            System.out.println("He has scored " + amountOfGoals + " goals.");
        }


    }
}
