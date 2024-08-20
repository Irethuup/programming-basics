package Exam_05;

import java.util.Scanner;

public class PCGameShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат:
        //•	Брой продадени игри- n - цяло положително число в интервала [1… 100]
        //За следващите n реда се чете по един ред:
        //o	Име на игра - текст

        int n = Integer.parseInt(scanner.nextLine());

        int hearthstoneCount = 0;
        int forniteCount = 0;
        int overwatchCount = 0;
        int otherGamesCount = 0;

        for (int i = 0; i < n; i++) {
            String game = scanner.nextLine();
            switch (game) {
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    forniteCount++;
                    break;
                case "Overwatch":
                    overwatchCount++;
                    break;
                default:
                    otherGamesCount++;
                    break;
            }
        }

        System.out.printf("Hearthstone - %.2f%%\n", hearthstoneCount * 1.0 / n * 100);
        System.out.printf("Fornite - %.2f%%\n", forniteCount * 1.0 / n * 100);
        System.out.printf("Overwatch - %.2f%%\n", overwatchCount * 1.0 / n * 100);
        System.out.printf("Others - %.2f%%", otherGamesCount * 1.0 / n * 100);
    }
}
