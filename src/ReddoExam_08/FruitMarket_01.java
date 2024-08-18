package ReddoExam_08;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double quantityOfBananasKG = Double.parseDouble(scanner.nextLine());
        double quantityOfOrangesKG = Double.parseDouble(scanner.nextLine());
        double quantityOfRaspberriesKG = Double.parseDouble(scanner.nextLine());
        double quantityOfStrawberriesKG = Double.parseDouble(scanner.nextLine());

        //   •	цената на малините е на половина по-ниска от тази на ягодите;
        //   •	цената на портокалите е с 40% по-ниска от цената на малините;
        //   •	цената на бананите е с 80% по-ниска от цената на малините.

        //програма, която пресмята колко пари са ѝ необходими за да плати сметката

        double raspberriesPrice = strawberriesPrice - (strawberriesPrice * 0.5);
        double orangesPrice = raspberriesPrice - (raspberriesPrice * 0.4);
        double bananasPrice = raspberriesPrice - (raspberriesPrice * 0.8);

        double moneyNeeded = (strawberriesPrice * quantityOfStrawberriesKG)
                + (raspberriesPrice * quantityOfRaspberriesKG)
                + (orangesPrice * quantityOfOrangesKG)
                + (bananasPrice * quantityOfBananasKG);
        System.out.printf("%.2f", moneyNeeded);
    }
}
