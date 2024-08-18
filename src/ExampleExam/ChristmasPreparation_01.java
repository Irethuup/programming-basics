package ExampleExam;

import java.util.Scanner;

public class ChristmasPreparation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 числа:
        //•	Първи ред – брой ролки опаковъчна хартия - цяло число в интервала [0...100]
        //•	Втори ред – брой ролки плат - цяло число в интервала [0...100]
        //•	Трети ред –  литри лепило - реално число в интервала [0.00…50.00]
        //•	Четвърти ред – процент намаление - цяло число в интервала [0...100]

        int rollsOfWrappingPaper = Integer.parseInt(scanner.nextLine());
        int rollsOfCloth = Integer.parseInt(scanner.nextLine());
        double littersOfGlue =Double.parseDouble(scanner.nextLine());
        double discountPercentage = Double.parseDouble(scanner.nextLine());

        double PriceOfWrappingPaper = rollsOfWrappingPaper * 5.80;
        double priceOfCloth = rollsOfCloth * 7.20;
        double priceOfGlue = littersOfGlue * 1.20;

        double totalSum = PriceOfWrappingPaper + priceOfCloth + priceOfGlue;
        double sumWithDiscount = totalSum * (1 - discountPercentage / 100);
        System.out.printf("%.3f",sumWithDiscount );

    }
}
