package PrepareExam;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        //• Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        //• Брой нощувки – цяло число в интервала [0 … 1000]
        //• Цена за нощувка – реално число в интервала [1.00 … 500.00]
        //• Процент за допълнителни разходи – цяло число в интервала [0 … 100]

        double budget = Double.parseDouble(scanner.nextLine());
        int overnightStay = Integer.parseInt(scanner.nextLine());
        double overnightStayPrice = Double.parseDouble(scanner.nextLine());
        int percentageForExtraExpenses = Integer.parseInt(scanner.nextLine());

        if (overnightStay > 7) {
            overnightStayPrice = overnightStayPrice - (overnightStayPrice * 0.05);
        }
        double priceForAllDays = overnightStay * overnightStayPrice;
        double additionalMoney = percentageForExtraExpenses * 1.0 / 100 * budget;

        double moneyNeeded = priceForAllDays + additionalMoney;

        double diff = Math.abs(moneyNeeded - budget);
        if (budget >= moneyNeeded) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}
