package WO2_exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        double recordInSeconds = Double.parseDouble(scanner.nextLine());

        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double timeSwimming = distanceInMeters * timeInSeconds;
        double additionalTime = Math.floor(distanceInMeters / 15) * 12.5;

        double totalTime = timeSwimming + additionalTime;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        }

    }
}
