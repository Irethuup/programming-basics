package Exam_04;

import java.util.Scanner;

public class FavouriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieTitle = scanner.nextLine();
        int maxSum = 0;
        int movieCounter = 0;
        String bestMovie = "";

        while (!"STOP".equals(movieTitle)) {
            int currentSum = 0;
            movieCounter++;
            for (int i = 0; i < movieTitle.length(); i++) {
                int currentChar = movieTitle.charAt(i);
                currentSum += currentChar;

                if (currentChar >= 65 && currentChar <= 90) {
                    currentSum -= movieTitle.length();
                } else if (currentChar >= 97 && currentChar <= 122) {
                    currentSum -= movieTitle.length() * 2;
                }
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestMovie = movieTitle;
            }

            if (movieCounter >= 7) {
                break;
            }
            movieTitle = scanner.nextLine();
        }

        if (movieCounter >= 7) {
            System.out.println("The limit is reached.");
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxSum);

    }
}

