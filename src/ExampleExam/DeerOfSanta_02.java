package ExampleExam;

import java.util.Scanner;

public class DeerOfSanta_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат пет реда:
        //•	Първи ред – брой дни, в които Дядо Коледа отсъства – цяло число в интервала [1…5000]
        //•	Втори ред – оставена храна в килограми – цяло число в интервала [0…100000]
        //•	Трети ред – храна на ден за първия елен в килограми – реално число в интервала [0.00…100.00]
        //•	Четвърти ред – храна на ден за втория елен в килограми– реално число в интервала [0.00…100.00]
        //•	Пети ред – храна на ден за третия елен в килограми – реално число в интервала [0.00…100.00]

        int amountOfDaysSantaMissing = Integer.parseInt(scanner.nextLine());
        int leftFoodInKG = Integer.parseInt(scanner.nextLine());
        double foodPerDayFor1DeerKG = Double.parseDouble(scanner.nextLine());
        double foodPerDayFor2DeerKG = Double.parseDouble(scanner.nextLine());
        double foodPerDayFor3DeerKG = Double.parseDouble(scanner.nextLine());

        //Нужна храна за:
        //първи елен => 2 дни * 1 кг = 2 кг
        //втори елен => 2 дни * 1 кг = 2 кг
        //трети елен => 2 дни * 2 кг = 4 кг
        //Общо нужна храна => 2 + 2 + 4 = 8 кг
        //8 < 10 => количеството храна е достатъчно
        //=> 10 - 8 = 2 кг. храна остават

        double firstDeerFoodKG = amountOfDaysSantaMissing * foodPerDayFor1DeerKG;
        double secondDeerFoodKG = amountOfDaysSantaMissing * foodPerDayFor2DeerKG;
        double thirdDeerFoodKG = amountOfDaysSantaMissing * foodPerDayFor3DeerKG;

        double totalNeededFood = firstDeerFoodKG + secondDeerFoodKG + thirdDeerFoodKG;
        double leftFood = leftFoodInKG - totalNeededFood;

        if (leftFood >= 0) {
            int roundedLeftFood = (int) Math.floor(leftFood); // Round down
            System.out.printf("%d kilos of food left.", roundedLeftFood);
        } else {
            int roundedNeededFood = (int) Math.ceil(Math.abs(leftFood)); // Round up
            System.out.printf("%d more kilos of food are needed.", roundedNeededFood);
        }
    }
}
