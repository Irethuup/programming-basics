package Exam_07;

import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Потребителят въвежда 3 реда:
        //1.	Брой дограми – цяло число в интервала [0..1000];
        //2.	Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
        //3.	Начин на получаване – текст
        //•	С доставка - "With delivery"
        //•	Без доставка - "Without delivery"

        int amountOfFrames = Integer.parseInt(scanner.nextLine());
        String framesType = scanner.nextLine();
        String methodOfReceipt = scanner.nextLine();

        if (amountOfFrames < 10) {
            System.out.println("Invalid order");
            return;
        }

        double pricePerFrame = 0;
        double discount = 0;

        switch (framesType) {
            case "90X130" -> {
                pricePerFrame = 110;
                if (amountOfFrames > 60) {
                    discount = 0.08;
                } else if (amountOfFrames > 30) {
                    discount = 0.05;
                }
            }
            case "100X150" -> {
                pricePerFrame = 140;
                if (amountOfFrames > 80) {
                    discount = 0.10;
                } else if (amountOfFrames > 40) {
                    discount = 0.06;
                }
            }
            case "130X180" -> {
                pricePerFrame = 190;
                if (amountOfFrames > 50) {
                    discount = 0.12;
                } else if (amountOfFrames > 20) {
                    discount = 0.07;
                }
            }
            case "200X300" -> {
                pricePerFrame = 250;
                if (amountOfFrames > 50) {
                    discount = 0.14;
                } else if (amountOfFrames > 25) {
                    discount = 0.09;
                }
            }
            default -> {
                System.out.println("Invalid frame type");
                return;
            }
        }

        double totalPrice = amountOfFrames * pricePerFrame;
        totalPrice -= totalPrice * discount;

        if (methodOfReceipt.equals("With delivery")) {
            totalPrice += 60;
        }

        if (amountOfFrames > 99) {
            totalPrice -= totalPrice * 0.04;
        }

        System.out.printf("%.2f BGN%n", totalPrice);
    }
}
