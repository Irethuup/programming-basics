package Exam;

import java.util.Scanner;

public class ANDProcessors_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        //•	Първи ред – броят процесори, които трябва да се изработят – цяло число в интервала [1...500 000]
        //•	Втори ред – броят служители – цяло число в интервала [1...1000]
        //•	Трети ред – работните дни – цяло число в интервала [1...1000]

        int processorsCount = Integer.parseInt(scan.nextLine());
        int workersCount = Integer.parseInt(scan.nextLine());
        int workDays = Integer.parseInt(scan.nextLine());

        double hoursTotal = workersCount * workDays * 8;
        int processorsProduced = (int) Math.floor(hoursTotal / 3);

        //На конзолата трябва да се отпечата текст, спрямо броя на изработените процесори:
        //•	Ако са повече или колкото плануваните:
        //o	"Profit: -> {печалби} BGN"
        //•	Ако са по-малко от плануваните:
        //o	"Losses: -> {загуби} BGN"
        //Сумите трябва да са форматирани до втория знак след десетичната запетая.

        if (processorsProduced >= processorsCount) {
            double profit = (processorsProduced - processorsCount) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        } else {
            double losses = (processorsCount - processorsProduced) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", losses);
        }
    }
}
