package Exam_05;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат:
        //•	На първия ред – желаната печалба на клуба - реално число в интервала [1.00... 15000.00]
        //Поредица от два реда до получаване на командата "Party!" или до достигане на желаната печалба:
        //o	Име на коктейла – текст
        //o	Брой на коктейлите за поръчката – цяло число в интервала [1… 50]

        double wantedPrizeOfClub = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();
        double income = 0.0;

        while (!"Party!".equals(cocktail)) {
            int quantity = Integer.parseInt(scanner.nextLine());

            int price = quantity * cocktail.length();
            double finalPrice = price;
            if (price % 2 != 0) {
                finalPrice *= 0.75;
            }
            income += finalPrice;
            wantedPrizeOfClub -= finalPrice;
            if (wantedPrizeOfClub <= 0) {
                break;
            }

            cocktail = scanner.nextLine();
        }

        if ("Party!".equals(cocktail)) {
            System.out.println(String.format("We need %.2f leva more.", wantedPrizeOfClub));
        } else {
            System.out.println("Target acquired.");
        }

        System.out.printf("Club income - %.2f leva.", income);

    }
}
