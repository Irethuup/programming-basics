package Exam_06;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Входът се чете от конзолата и съдържа точно 3 реда:
        //•	На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        //•	На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        //•	На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]

        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int walksAmount = Integer.parseInt(scanner.nextLine());
        int caloriesConsumed = Integer.parseInt(scanner.nextLine());

        int totalMinutes = walksAmount * minutesPerWalk;
        int totalCalorieUsed = totalMinutes * 5;
        double halfCaloriesConsumed = caloriesConsumed * 0.5;

        if (totalCalorieUsed >= halfCaloriesConsumed) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %s.", totalCalorieUsed);
        } else if (totalCalorieUsed < halfCaloriesConsumed) {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %s.", totalCalorieUsed);
        }

    }
}
