package Weekend_03;

import java.util.Scanner;

public class SecondVariantOnCinemaTicket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        if (!dayOfWeek.equals("Monday") && !dayOfWeek.equals("Tuesday") && !dayOfWeek.equals("Friday")) {
            if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
                System.out.println(14);
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                System.out.println(16);
            }
        } else {
            System.out.println(12);
        }
    }

}


//could do w a switch/case aswell.


//        switch (dayOfWeek) {
//            case "Monday":
//            case "Tuesday":
//            case "Friday":
//                System.out.println(12);
//                break;
//            case "Wednesday":
//            case "Thursday":
//                System.out.println(14);
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.println(16);
//                break;
//        }