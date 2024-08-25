package Exam_02;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът е поредица от цели числа и текст:
        //•	На първия ред до получаване на командата "Finish" - име на филма – текст
        //•	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        //•	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
        //o	Типа на закупения билет - текст ("student", "standard", "kid")

        int students = 0;
        int standard = 0;
        int kids = 0;
        String filmName = scanner.nextLine();
        while (!"Finish".equals(filmName)) {
            int places = Integer.parseInt(scanner.nextLine());
            int people = 0;
            for (int i = 0; i < places; i++) {
                String command = scanner.nextLine();
                if ("student".equals(command)) {
                    students++;
                } else if ("standard".equals(command)) {
                    standard++;
                } else if ("kid".equals(command)) {
                    kids++;
                } else if ("End".equals(command)) {
                    break;
                }
                people++;
            }
            System.out.printf("%s - %.2f%% full.%n", filmName, people * 1.0 / places * 100);
            filmName = scanner.nextLine();
        }
        int totalTickets = standard + students + kids;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (students * 1.0 / totalTickets * 100));
        System.out.printf("%.2f%% standard tickets.%n", (standard * 1.0 / totalTickets * 100));
        System.out.printf("%.2f%% kids tickets.%n", (kids * 1.0 / totalTickets * 100));


    }
}
