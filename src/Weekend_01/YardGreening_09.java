package Weekend_01;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allSqM = Double.parseDouble(scanner.nextLine());
        double amount = allSqM * 7.61;

        double discount = amount * 0.18; //(18/100)
        double finalPrice = amount - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);


    }
}
