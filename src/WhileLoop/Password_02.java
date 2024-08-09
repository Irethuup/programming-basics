package WhileLoop;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {

            String currentPassword = scanner.nextLine();

            if (currentPassword.equals(password)){
                break;
            }
        }
        System.out.printf("Welcome %s!", username);
    }
}
