package ForLoop;

import java.util.Scanner;

public class Numbers1_NWithStep3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // i = i + 3 (za i += 3)
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
