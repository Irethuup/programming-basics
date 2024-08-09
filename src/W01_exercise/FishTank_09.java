package W01_exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Дължина в см – цяло число в интервала [10 … 500]
        //2. Широчина в см – цяло число в интервала [10 … 300]
        //3. Височина в см – цяло число в интервала [10… 200]
        //4. Процент – рealno число в интервала [0.000 … 100.000]

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double percent = Double.parseDouble(scanner.nextLine());

        //обем на аквариумa: 85 * 75 * 47 = 299625 см3
        // обем в литри: 299625 * 0.001 или 299625 / 1000 => 299.625 литра
        // заето пространство: 17% = 0.17
        // нужни литри: 299.625 * (1 - 0.17) = 248.68875 литра

        double volumeAquarium = length * width * height;
        double volumeLiters = volumeAquarium / 1000;
        double neededLiters = volumeLiters * (1 - percent/100);

        //double neededLiters = volumeLiters  - (volumeAquarium * percent /100);

        System.out.println(neededLiters);


    }
}
