package Exam;

import java.util.Scanner;

public class RoomPainting_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //От конзолата се четат 4 числа:
        //1.	Броя кутии с боя – цяло число в интервала [1 … 10 000]
        //2.	Броя на ролките тапети – цяло число в интервала [1 ... 10 000]
        //3.	Цената за един чифт ръкавици – реално число  в интервала [0.00 ... 1000.00]
        //4.	Цената за една четка – реално число  в интервала [0.00 ... 2000.00]

        int dyeBoxesAmount = Integer.parseInt(scan.nextLine());
        int wallpaperRollsAmount = Integer.parseInt(scan.nextLine());
        double oneGlovesPrice = Double.parseDouble(scan.nextLine());
        double oneBrushPrice = Double.parseDouble(scan.nextLine());

        double totalDyePrice = 21.50 * dyeBoxesAmount;
        double totalWallpaperPrice = 5.20 * wallpaperRollsAmount;
        double amountNeededGloves = Math.ceil(wallpaperRollsAmount * 0.35);

        //Броят нужни четки: 48% от 10 = 4 броя (4.8, закръглено надолу
        double amountNeededBrushes = Math.floor(dyeBoxesAmount * 0.48);
        double totalPriceOfGloves = amountNeededGloves * oneGlovesPrice;
        double totalPriceBrushes = amountNeededBrushes * oneBrushPrice;

        double totalSumOfProducts = totalDyePrice + totalWallpaperPrice + totalPriceOfGloves + totalPriceBrushes;
        double deliveryPrice = totalSumOfProducts / 15;
        System.out.printf("This delivery will cost %.2f lv.", deliveryPrice);

    }
}
