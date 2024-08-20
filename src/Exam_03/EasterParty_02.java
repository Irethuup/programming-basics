package Exam_03;

import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        //1.	Брой гости – цяло число в интервала [1...99]
        //2.	Цена на куверт за един човек – реално число в интервала [0.00 … 99.00]
        //3.	Бюджетът на Деси  – реално число в интервала [0.00 … 9999.00]

        int guestsAmount = Integer.parseInt(scanner.nextLine());
        double envelopePricePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        //•	Между 10 (вкл.) и 15 (вкл.) човека -> 15 % отстъпка от куверта за един човек

        if (guestsAmount >= 10 && guestsAmount <= 15) {
            envelopePricePerPerson = envelopePricePerPerson - (envelopePricePerPerson * 0.15);
        } else if (guestsAmount > 15 && guestsAmount <= 20) {
            envelopePricePerPerson = envelopePricePerPerson - (envelopePricePerPerson * 0.20);
        } else if (guestsAmount > 20) {
            envelopePricePerPerson = envelopePricePerPerson - (envelopePricePerPerson * 0.25);
        }

        double cakePrice = budget * 0.10;
        double totalSum = (guestsAmount * envelopePricePerPerson) + cakePrice;

        //•	Ако бюджетът  е достатъчен:
        //o	"It is party time! {останали пари} leva left."
        //•	Ако бюджетът не е достатъчен:
        //o	"No party! {недостигащи пари} leva needed."
        //Резултатът да бъде форматиран до втория знак след десетичната запетая.

        if (budget >= totalSum) {
            System.out.printf("It is party time! %.2f leva left.", (budget - totalSum));
        } else if (budget < totalSum) {
            System.out.printf("No party! %.2f leva needed.", Math.abs((budget - totalSum)));
        }

    }
}
