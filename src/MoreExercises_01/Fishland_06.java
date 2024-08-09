package MoreExercises_01;

import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Паламуд – 60% по-скъп от скумрията (0.6)
        //•	Сафрид – 80% по-скъп от цацата (0.8)

        //•	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        double mackerelPrice = Double.parseDouble(scanner.nextLine());

        //•	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        double sprinklePrice = Double.parseDouble(scanner.nextLine());

        //•	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        double kgBonito = Double.parseDouble(scanner.nextLine());

        //•	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        double kgScad = Double.parseDouble(scanner.nextLine());

        //•	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]
        int kgMussels = Integer.parseInt(scanner.nextLine());

        //•	Миди – 7.50 лв. за килограм
        double mussels = Double.parseDouble(scanner.nextLine());




    }
}
