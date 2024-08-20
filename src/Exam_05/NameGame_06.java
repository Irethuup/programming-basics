package Exam_05;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //До получаване на командата "Stop" се чете по един ред:
        //•	Име на играча с дължина n - текст
        //За всеки играч се четат n на брой реда:
        //•	число – цяло число в интервала[0…127]

        String playerName = scanner.nextLine();
        int bestPoints = 0;
        String winner = "";


        while (!"Stop".equals(playerName)) {
            int currentPoints = 0;
            for (int i = 0; i < playerName.length(); i++) {
                int n = Integer.parseInt(scanner.nextLine());

        //int firstLetter = playerName.charAt(0);
                if (n == playerName.charAt(i)) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
            }

            if (currentPoints >= bestPoints) {
                bestPoints = currentPoints;
                winner = playerName;
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, bestPoints);
    }
}
