package Exam_08;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой дни – цяло число в интервала [1 … 5]
        //•	Брой часове за всеки един от дните - цяло число в интервала [1 … 24]

        int amountOfDays = Integer.parseInt(scanner.nextLine());
        int amountOfHoursPerDay = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        for (int day = 1; day <= amountOfDays; day++) {

            double pricePerDay = 0;
            for (int hour = 1; hour <= amountOfHoursPerDay; hour++){
                //За всеки четен ден и нечетен час, паркингът таксува 2.50 лева
                // нечетен ден и четен час таксата е 1.25 лева,
                // във всички останали случаи се заплаща 1 лев
                if (day % 2 == 0 && hour % 2 != 0) {
                    pricePerDay += 2.50;
                } else if (day % 2 != 0 && hour % 2 == 0) {
                    pricePerDay += 1.25;
                } else {
                    pricePerDay += 1;
                }
            }
            totalPrice += pricePerDay;
            System.out.printf("Day: %d - %.2f leva\n", day, pricePerDay);
        }
        //•	За всеки изминал ден, общата сума, която трябва да се плати:
        //"Day: {индексът на деня} – {общата сума за деня} leva"
        //•	Когато програмата приключи:
        //"Total: {общата сума за всички дни} leva"
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
