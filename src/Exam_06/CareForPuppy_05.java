package Exam_06;

import java.util.Scanner;

public class CareForPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
        //•	На всеки следващ ред до получаване на команда Adopted
        // ще получавате колко грама изяжда кученцето на всяко хранене - цяло число в интервала [10 …1000]

        int totalBroughtFoodKG = Integer.parseInt(scanner.nextLine());
        int totalFoodInGrams = totalBroughtFoodKG * 1000;

        String input = scanner.nextLine();
        while (!"Adopted".equals(input)) {
            int dailyFoodInGrams = Integer.parseInt(input);
            totalFoodInGrams -= dailyFoodInGrams;
            input = scanner.nextLine();
        }


        if (totalFoodInGrams >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", totalFoodInGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalFoodInGrams * (-1));
        }

    }
}
