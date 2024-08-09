package WhileLoop;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (true) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

            if (sum >= number) {
                break;
            }
        }
        System.out.println(sum);
    }
}
