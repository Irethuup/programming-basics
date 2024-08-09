package W01_exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3. Количество разредител (в литри) - цяло число в интервала [1…30]
        //4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

        int nylonKVM = Integer.parseInt(scanner.nextLine());
        int paintLiter = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        //· Предпазен найлон - 1.50 лв. за кв. метър ( + 2 kv. m)
        //· Боя - 14.50 лв. за литър ( + 10% )
        //· Разредител за боя - 5.00 лв. за литър
        // торбичка - 0.40

        double sumNylon = (nylonKVM + 2) * 1.50;
        double sumPaint = (paintLiter * 1.10)* 14.50;
        double sumThinner = thinner * 5;

        double materialPrice = sumNylon + sumPaint + sumThinner + 0.40;

        double builderPrice = (materialPrice * 0.30) * hours;
        double finalSum = materialPrice + builderPrice;

        //"{сумата на всички разходи}"
        System.out.println(finalSum);


    }
}
