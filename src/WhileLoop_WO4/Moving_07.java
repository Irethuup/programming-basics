package WhileLoop_WO4;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int altitudeOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int availableSpace = widthOfFreeSpace * altitudeOfFreeSpace * lengthOfFreeSpace;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            int currentBoxes = Integer.parseInt(command);
            availableSpace -= currentBoxes;

            if (availableSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
                break;
            }

            command = scanner.nextLine();
        }

        if (availableSpace >= 0) {
            System.out.printf("%d Cubic meters left.", availableSpace);
        }

    }
}
