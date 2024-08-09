package WO2_exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statistsNumber = Integer.parseInt(scanner.nextLine());
        double outfitPerStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = movieBudget * 0.10;
        double allUniformPrice = statistsNumber * outfitPerStatist;

        if (statistsNumber > 150) {
            allUniformPrice = allUniformPrice * 0.90;
        }

        double totalPrice = decorPrice + allUniformPrice;

        double diff = Math.abs(movieBudget -totalPrice);
        if (totalPrice <= movieBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);

        }
    }
}
