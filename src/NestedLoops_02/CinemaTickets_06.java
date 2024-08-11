package NestedLoops_02;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът е поредица от цели числа и текст:
        // • На първия ред до получаване на командата "Finish" - име на филма – текст
        // • На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        // • За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване накомандата "End":
        //      o Типа на закупения билет - текст ("student", "standard", "kid")

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;

        while (true) {
            String movieName = scanner.nextLine();
            if (movieName.equals("Finish")) {
                break;
            }

            int freeSeats = Integer.parseInt(scanner.nextLine());
            int soldTickets = 0;

            while (soldTickets < freeSeats) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }

                soldTickets++;
                totalTickets++;

                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;

                    // if (ticketType.equals("student")) {
                    //       studentTickets++;
                    //       break;
                    //  } else if (ticketType.equals("standard")) {
                    //      standardTickets++;
                    //      break;
                    //  } else if ("kid".equals(ticketType)) {
                    //      kidTickets++;
                    //      break;
                    // } else {
                    //     return;
                    //   }

                }
            }

            double percentageFull = (soldTickets * 100.0) / freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentageFull);
        }

        double studentPercentage = (studentTickets * 100.0) / totalTickets;
        double standardPercentage = (standardTickets * 100.0) / totalTickets;
        double kidPercentage = (kidTickets * 100.0) / totalTickets;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPercentage);
        System.out.printf("%.2f%% standard tickets.%n", standardPercentage);
        System.out.printf("%.2f%% kids tickets.%n", kidPercentage);

    }
}