package Exam_05;

import java.util.Scanner;

public class TravelAgency_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        String pack = scan.nextLine();
        boolean VIP = scan.nextLine().equals("yes");
        int days = Integer.parseInt(scan.nextLine());
        boolean isValid = false;

        double price = 0.0;

        if (days > 7) {
            days--;
        }

        switch (town) {
            case "Bansko":
            case "Borovets":
                if (VIP) {
                    if ("noEquipment".equals(pack)) {
                        price = 80 * 0.95;
                    } else if ("withEquipment".equals(pack)) {
                        price = 100 * 0.9;
                    } else {
                        isValid = true;
                    }
                } else {
                    if ("noEquipment".equals(pack)) {
                        price = 80;
                    } else if ("withEquipment".equals(pack)) {
                        price = 100;
                    } else {
                        isValid = true;
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (VIP) {
                    if ("withBreakfast".equals(pack)) {
                        price = 130 * 0.88;
                    } else if ("noBreakfast".equals(pack)) {
                        price = 100 * 0.92;
                    } else {
                        isValid = true;
                    }
                } else {
                    if ("withBreakfast".equals(pack)) {
                        price = 130;
                    } else if ("noBreakfast".equals(pack)) {
                        price = 100;
                    } else {
                        isValid = true;
                    }
                }
                break;
            default:
                isValid = true;
                break;
        }
        if (isValid) {
            System.out.println("Invalid input!");
        } else if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            double finalPrice = days * price;
            System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
        }
    }
}
