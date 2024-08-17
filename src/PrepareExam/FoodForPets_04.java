package PrepareExam;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        double totalFoodAmount = Double.parseDouble(scanner.nextLine());

        int totalDogFood = 0;
        int totalCatFood = 0;
        double totalBiscuits = 0;

        for (int i = 1; i <= daysCount; i++) {
            int dogAmountOfFood = Integer.parseInt(scanner.nextLine());
            int catAmountOfFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                totalBiscuits += (dogAmountOfFood + catAmountOfFood) * 0.1;
            }
            totalDogFood += dogAmountOfFood;
            totalCatFood += catAmountOfFood;
        }

        int totalEatenFood = totalCatFood + totalDogFood;
        double totalEatenFoodPercentage = (totalEatenFood / totalFoodAmount) * 100;
        double totalCatFoodPercentage = ((double) totalCatFood / totalEatenFood) * 100;
        double totalDogFoodPercentage = ((double) totalDogFood / totalEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(totalBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenFoodPercentage);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogFoodPercentage);
        System.out.printf("%.2f%% eaten from the cat.%n", totalCatFoodPercentage);
    }

}
