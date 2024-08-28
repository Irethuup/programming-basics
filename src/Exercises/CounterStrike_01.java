package Exercises;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int wonBattles = 0;

        // Loop until "End of battle" or not enough energy
        while (true) {
            String input = scanner.nextLine();

            if ("End of battle".equals(input)) {
                System.out.printf("Won battles: %d. Energy left: %d%n", wonBattles, energy);
                break;
            }

            int distance = Integer.parseInt(input);
            if (energy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", wonBattles, energy);
                break;
            }
            energy -= distance;
            wonBattles++;

            // Every third won battle increases the energy by the current count of won battles
            if (wonBattles % 3 == 0) {
                energy += wonBattles;
            }
        }
    }
}
