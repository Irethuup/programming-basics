package Exam_03;

import java.util.Scanner;

public class EasterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 5 реда:
        //1.	Цена на брашното за един килограм – реално число в интервала [0.00 … 10000.00]
        //2.	Килограми на брашното – реално число в интервала [0.00 … 10000.00]
        //3.	Килограми на захарта – реално число в интервала [0.00 … 10000.00]
        //4.	Брой кори с яйца – цяло число в интервала [0 … 10000]
        //5.	Пакети мая  – цяло число в интервала [0 … 10000]

        double flourPriceForKG = Double.parseDouble(scanner.nextLine());
        double flourKGS = Double.parseDouble(scanner.nextLine());
        double sugarKGS = Double.parseDouble(scanner.nextLine());
        double crustsWEggsCount = Double.parseDouble(scanner.nextLine());
        double mayaPackets = Double.parseDouble(scanner.nextLine());

        //•	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
        //•	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
        //•	цената на един пакет мая е с 80% по-ниска от цената на килограм захар

        double sugarPrice1KG = flourPriceForKG - (flourPriceForKG * 0.25);
        double priceForOneCrust = flourPriceForKG + (flourPriceForKG * 0.10);
        double priceForOnePacketMaya = sugarPrice1KG - (sugarPrice1KG * 0.8);

        double totalSum = (flourPriceForKG * flourKGS)
                + (sugarPrice1KG * sugarKGS)
                + (priceForOneCrust * crustsWEggsCount)
                + (priceForOnePacketMaya * mayaPackets);

        System.out.printf("%.2f", totalSum);
    }
}
