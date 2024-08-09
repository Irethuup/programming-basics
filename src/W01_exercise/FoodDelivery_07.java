package W01_exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //· Брой пилешки менюта – цяло число в интервала [0 … 99]
        //· Брой менюта с риба – цяло число в интервала [0 … 99]
        //· Брой вегетариански менюта – цяло число в интервала [0 … 99]

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        //• Пилешко меню – 10.35 лв.
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 лв.

        //Цена за пилешките менюта: 2 броя * 10.35 = 20.70
        // Цена за менютата с риба: 4 броя * 12.40 = 49.60
        // Цена за вегетарианските менюта: 3 броя * 8.15 = 24.45
        // Обща цена на менютата: 20.70 + 49.60 + 24.45 = 94.75
        // Цена на десерта: 20% от 94.75 = 18.95 Ц
        // ена на доставка: 2.50 (по условие)
        // Обща цена на поръчката: 94.75 + 18.95 + 2.50 = 116.20

        double priceChicken = chickenMenus * 10.35;
        double priceFish = fishMenus * 12.40;
        double priceVegetarian = vegetarianMenus * 8.15;
        double commonPrice = priceChicken + priceFish + priceVegetarian;
        double dessertPrice = 0.2 * 94.75;
        double finalBill = (commonPrice * 1.20) + 2.50;

        System.out.println(finalBill);

    }
}
