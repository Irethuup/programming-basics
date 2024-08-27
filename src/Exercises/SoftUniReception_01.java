package Exercises;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int emp1 = scanner.nextInt();
        int emp2 = scanner.nextInt();
        int emp3 = scanner.nextInt();

        int studentsCount = scanner.nextInt();

        // total efficiency per hour
        int totalEfficiencyPerHour = emp1 + emp2 + emp3;
        int hoursNeeded = 0;

        while (studentsCount > 0) {
            hoursNeeded++;
            if (hoursNeeded % 4 != 0) { // Every fourth hour is a break
                studentsCount -= totalEfficiencyPerHour;
            }
        }

        System.out.println("Time needed: " + hoursNeeded + "h.");
    }
}
