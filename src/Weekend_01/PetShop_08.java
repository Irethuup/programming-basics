package Weekend_01;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDog = Integer.parseInt(scanner.nextLine());
        int countCat = Integer.parseInt(scanner.nextLine());

        double onePackDog = 2.50;
        double onePackCat = 4;

        double totalDog = countDog * onePackDog;
        double totalCat = countCat * onePackCat;

        double totalSum = totalCat + totalDog;

        System.out.printf("%.1f lv.", totalSum);

       // System.out.println(totalSum + " lv.");

    }
}
