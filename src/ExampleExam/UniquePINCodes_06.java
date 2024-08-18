package ExampleExam;

import java.util.Scanner;

public class UniquePINCodes_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        //•	Горната граница на първото число - цяло число в диапазона [1...9]
        //•	Горната граница на второто число - цяло число в диапазона [1...9]
        //•	Горната граница на третото число - цяло число в диапазона [1...9]

        int rangeOfFirstNumber = Integer.parseInt(scanner.nextLine());
        int rangeOfSecondNumber = Integer.parseInt(scanner.nextLine());
        int rangeOfThirdNumber = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <= rangeOfFirstNumber; firstDigit++) {
            if (firstDigit % 2 != 0)  {
                continue;
            }
            for (int secondDigit = 2; secondDigit <= rangeOfSecondNumber; secondDigit++) {
                boolean notPrimeNumber = false;
                for (int i = 2; i < secondDigit; i++) {
                    if (secondDigit % i == 0) {
                        notPrimeNumber = true;
                        break;
                    }
                }
                if (notPrimeNumber) {
                    continue;
                }

                for (int thirdDigit = 1; thirdDigit <= rangeOfThirdNumber; thirdDigit++) {
                    if (thirdDigit % 2 != 0)  {
                        continue;
                    }

                    System.out.printf("%d %d %d%n",firstDigit, secondDigit, thirdDigit);                }
            }
        }

    }
}
