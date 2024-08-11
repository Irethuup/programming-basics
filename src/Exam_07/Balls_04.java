package Exam_07;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
        //2.	След това се четат N на брой цветове

        int n = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherColors = 0;
        int dividesFromBlack = 0;

        for (int i = 0; i < n; i++) {
            String color = scanner.nextLine();

            switch (color.toLowerCase()) {
                case "red":
                    totalPoints += 5;
                    redBalls++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowBalls++;
                    break;
                case "white":
                    totalPoints += 20;
                    whiteBalls++;
                    break;
                case "black":
                    totalPoints /= 2;
                    dividesFromBlack++;
                    break;
                default:
                    otherColors++;
                    break;
            }
        }
        System.out.println("Total points: " + totalPoints);
        System.out.println("Red balls: " + redBalls);
        System.out.println("Orange balls: " + orangeBalls);
        System.out.println("Yellow balls: " + yellowBalls);
        System.out.println("White balls: " + whiteBalls);
        System.out.println("Other colors picked: " + otherColors);
        System.out.println("Divides from black balls: " + dividesFromBlack);
    }
}
