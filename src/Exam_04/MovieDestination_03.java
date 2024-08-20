package Exam_04;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeToFilm = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int timePerScene = Integer.parseInt(scanner.nextLine());

        double scenePreparation = timeToFilm * 0.15;
        int timeForScenes = scenes * timePerScene;

        double totalTimeForFilming = scenePreparation + timeForScenes;

        if (totalTimeForFilming < timeToFilm) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",
                    Math.round(timeToFilm - totalTimeForFilming));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",
                    Math.round(totalTimeForFilming - timeToFilm));
        }
    }
}
