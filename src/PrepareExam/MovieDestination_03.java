package PrepareExam;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        //1. Бюджет на филма – реално число в диапазона [100 000.0… 2 000 000.0]
        //2. Дестинация – текст, с възможности "Dubai", "Sofia" и "London"
        //3. Сезон – текст, с възможности "Summer" и "Winter"
        //4. Брой дни – цяло число в диапазона [1… 40]
        double movieBudget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int daysAmount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (season.equals("Summer")) {
            if (destination.equals("Dubai")) {
                price = 40000;
            } else if (destination.equals("Sofia")) {
                price = 12500;
            } else if (destination.equals("London")) {
                price = 20250;
            }
        } else if (season.equals("Winter")) {
            if (destination.equals("Dubai")) {
                price = 45000;
            } else if (destination.equals("Sofia")) {
                price = 17000;
            } else if (destination.equals("London")) {
                price = 24000;
            }
        }
        double sum = daysAmount * price;

        if (destination.equals("Dubai")) {
            sum = sum - (sum * 0.30); // sum * 0.70
        } else if (destination.equals("Sofia")) {
            sum = sum + (sum * 0.25);
        }

        double diff = Math.abs(sum - movieBudget);
        if (sum <= movieBudget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }
    }
}
