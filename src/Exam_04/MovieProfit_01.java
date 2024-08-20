package Exam_04;

import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentMoneyForCinema = Integer.parseInt(scanner.nextLine());

        double ticketsPricePerDay = ticketsCount * ticketPrice;

        double totalPrice = ticketsPricePerDay * days;
        double moneyForCinema = totalPrice * percentMoneyForCinema / 100.0;
        double studioIncome = totalPrice - moneyForCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, studioIncome);

    }
}
