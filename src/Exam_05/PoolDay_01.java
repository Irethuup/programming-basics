package Exam_05;

import java.util.Scanner;

public class PoolDay_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        double entranceTax = Double.parseDouble(scan.nextLine());
        double loungePrice = Double.parseDouble(scan.nextLine());
        double umbrellaPrice = Double.parseDouble(scan.nextLine());

        double totalEnterPrice = entranceTax * people;
        double loungeCnt = Math.ceil(people * 0.75);
        double umbrellaCnt = Math.ceil(people / 2.0);

        double finalPrice = totalEnterPrice + loungeCnt * loungePrice + umbrellaCnt * umbrellaPrice;

        System.out.printf("%.2f lv.", finalPrice);
    }
}
