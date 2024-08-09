package ForLoop_exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        //the total number of climbers for each mountain
        int musalaClimbers = 0;
        int monBlancClimbers = 0;
        int kilimanjaroClimbers = 0;
        int k2Climbers = 0;
        int everestClimbers = 0;

        int totalClimbers = 0;

        for (int i = 0; i < numberOfGroups; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            totalClimbers += groupSize;

            if (groupSize <= 5) {
                musalaClimbers += groupSize;
            } else if (groupSize <= 12) {
                monBlancClimbers += groupSize;
            } else if (groupSize <= 25) {
                kilimanjaroClimbers += groupSize;
            } else if (groupSize <= 40) {
                k2Climbers += groupSize;
            } else {
                everestClimbers += groupSize;
            }
        }

        double musalaPercentage  = ( musalaClimbers * 100.0) / totalClimbers;
        double montBlancPercentage  = ( monBlancClimbers * 100.0) / totalClimbers ;
        double kilimanjaroPercentage = ( kilimanjaroClimbers * 100.0) / totalClimbers  ;
        double k2Percentage = (k2Climbers * 100.0) / totalClimbers;
        double everestPercentage = (everestClimbers * 100.0) / totalClimbers;


       // \n is an escape sequence that represents a newline character.
        // It is used to insert a line break or start a new line in strings or output.

        System.out.printf("%.2f%%\n", musalaPercentage);
        System.out.printf("%.2f%%\n", montBlancPercentage);
        System.out.printf("%.2f%%\n", kilimanjaroPercentage);
        System.out.printf("%.2f%%\n", k2Percentage);
        System.out.printf("%.2f%%\n", everestPercentage);

    }
}
