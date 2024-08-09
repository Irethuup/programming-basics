package WO2_exercise;

import java.util.Scanner;

public class Lunch_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Име на сериал – текст
        //2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
        //3.	Продължителност на почивката  – цяло число в диапазона [10… 120]

        String nameOfShow = scanner.nextLine();
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationOfBreak * 1.0 / 8;
        double relaxTime = durationOfBreak * 1.0 / 4;

        double remainingTime = durationOfBreak - lunchTime - relaxTime;

        if (remainingTime >= durationOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    nameOfShow, Math.ceil(remainingTime - durationOfEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    nameOfShow, Math.ceil(durationOfEpisode - remainingTime));
        }

    }
}
