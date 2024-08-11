package Demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first barcode: ");
        int firstCode = scanner.nextInt();
        System.out.print("Enter the second barcode: ");
        int secondCode = scanner.nextInt();

        System.out.println("You entered: " + firstCode + " and " + secondCode);
        if (String.valueOf(firstCode).length() != 4 || String.valueOf(secondCode).length() != 4
                || firstCode > secondCode) {
            return;
        }

        String firstCodeStr = String.valueOf(firstCode);
        int firstCodeDigit1 = Character.getNumericValue(firstCodeStr.charAt(0));
        int firstCodeDigit2 = Character.getNumericValue(firstCodeStr.charAt(1));
        int firstCodeDigit3 = Character.getNumericValue(firstCodeStr.charAt(2));
        int firstCodeDigit4 = Character.getNumericValue(firstCodeStr.charAt(3));

        String secondCodeStr = String.valueOf(secondCode);
        int secondCodeDigit1 = Character.getNumericValue(secondCodeStr.charAt(0));
        int secondCodeDigit2 = Character.getNumericValue(secondCodeStr.charAt(1));
        int secondCodeDigit3 = Character.getNumericValue(secondCodeStr.charAt(2));
        int secondCodeDigit4 = Character.getNumericValue(secondCodeStr.charAt(3));

        List<String> outputList = new ArrayList<>();
        for (int code = firstCode; code <= secondCode; code++) {
            String codeStr = String.valueOf(code);
            int codeDigit1 = Character.getNumericValue(codeStr.charAt(0));
            int codeDigit2 = Character.getNumericValue(codeStr.charAt(1));
            int codeDigit3 = Character.getNumericValue(codeStr.charAt(2));
            int codeDigit4 = Character.getNumericValue(codeStr.charAt(3));

            if (codeDigit1 >= firstCodeDigit1 && codeDigit1 <= secondCodeDigit1 && codeDigit1 % 2 != 0) {
                if (codeDigit2 >= firstCodeDigit2 && codeDigit2 <= secondCodeDigit2 && codeDigit2 % 2 != 0) {
                    if (codeDigit3 >= firstCodeDigit3 && codeDigit3 <= secondCodeDigit3 && codeDigit3 % 2 != 0) {
                        if (codeDigit4 >= firstCodeDigit4 && codeDigit4 <= secondCodeDigit4 && codeDigit4 % 2 != 0) {
                            outputList.add(codeStr);
                        }
                    }
                }
            }
        }
        System.out.println(String.join(" ", outputList));
        scanner.close();
    }
}
