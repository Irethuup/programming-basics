package Exam_07;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //1.	Име на авиокомпанията - текст
        //2.	Брой билети за	 възрастни – цяло число в диапазона [1…400]
        //3.	Брой детски билети – цяло число в диапазона [25…120]
        //4.	Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
        //5.	Цената на такса обслужване - реално число в диапазона [10.0…50.0]

        String companyName = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble (scanner.nextLine());
        double servicePrice = Double.parseDouble (scanner.nextLine());

        //Да се отпечата на конзолата крайната печалбата от продажбите, в следния формат:
        //•	"The profit of your agency from {име на авиокомпанията} tickets is {печалба за агенцията} lv."

        double childTicketPrice = adultTicketPrice * 0.3;
        double totalAdultTicketPrice = (adultTicketPrice + servicePrice) * adultTickets;
        double totalChildTicketPrice = (childTicketPrice + servicePrice) * childTickets;

        double totalRevenue = totalAdultTicketPrice + totalChildTicketPrice;
        double agencyProfit = totalRevenue * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.%n", companyName, agencyProfit);

    }
}
