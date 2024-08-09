package Weekend_03;

import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        if ("Monday".equals(dayOfWeek)) {
            System.out.println(12);
        } else if ("Tuesday".equals(dayOfWeek)) {
            System.out.println(12);
        } else if ("Wednesday".equals(dayOfWeek)) {
            System.out.println(14);
        } else if ("Thursday".equals(dayOfWeek)) {
            System.out.println(14);
        } else if ("Friday".equals(dayOfWeek)) {
            System.out.println(12);
        } else if ("Saturday".equals(dayOfWeek)) {
            System.out.println(16);
        } else if ("Sunday".equals(dayOfWeek)) {
            System.out.println(16);
        }

    }
}
