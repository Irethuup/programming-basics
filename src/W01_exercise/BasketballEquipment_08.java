package W01_exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int yearPrice = Integer.parseInt(scanner.nextLine());

        //•Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        double shoesPrice = yearPrice * 0.60; // shoesPrice = yearPrice - yearPrice * 0.40;

        double suitPrice = shoesPrice * 0.80; // suitPrice = shoesPrice - shoesPrice * 0.20;

        //•Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        double ballPrice = suitPrice / 4;

        //•Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double accessoriesPrice = ballPrice / 5;

        double finalPrice = yearPrice + shoesPrice + suitPrice + ballPrice + accessoriesPrice;

        System.out.println(finalPrice);

    }
}
