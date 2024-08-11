package Exam_08;

import java.util.Scanner;

public class Safari_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Бюджет – реално число в интервала [0.00… 10000.00]
        //•	Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
        //•	Ден от седмицата – текст с възможности "Saturday" и "Sunday"

        double budget = Double.parseDouble(scanner.nextLine());
        double amountOfPetrolNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfTheWeek = scanner.nextLine();

        //•	Цената на един литър гориво е 2.10 лв.
        //•	Цената за екскурзовод е 100лв.
        //•	В зависимост от деня има отстъпки от общата цена - за събота 10%, а за неделя 20%

        double petrolPrice = 2.10;
        int priceOfGuide = 100;
        double discountForSaturday = 0.1;
        double discountForSunday = 0.2;

        double totalSum = petrolPrice * amountOfPetrolNeeded
                + priceOfGuide;

        double priceWithDiscount = 0;
        if (dayOfTheWeek.equals("Saturday")){
            priceWithDiscount = totalSum - (discountForSaturday * totalSum);
        } else if (dayOfTheWeek.equals("Sunday")) {
            priceWithDiscount = totalSum - (discountForSunday * totalSum);
        }

        //•	Ако бюджетът е достатъчен:
        //"Safari time! Money left: {колко пари са им останали} lv. "
        //•	Ако бюджетът не е достатъчен:
        //"Not enough money! Money needed: {колко пари не им достигат} lv."
        //Сумите трябва да са форматирани до втория знак след десетичната запетая.

        if (priceWithDiscount <= budget){
            System.out.printf("Safari time! Money left: %.2f lv.", (budget - priceWithDiscount));
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", priceWithDiscount - budget );
        }
    }
}
