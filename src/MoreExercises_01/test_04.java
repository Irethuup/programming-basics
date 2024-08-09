package MoreExercises_01;

import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // едно евро е равно на 1.94лв
        //  Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        double pricePerKgVegetables = Double.parseDouble(scanner.nextLine());
        double pricePerKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        // Calculating the total cost in BGN
        double totalCostVegetables = pricePerKgVegetables * totalKgVegetables;
        double totalCostFruits = pricePerKgFruits * totalKgFruits;
        double totalCostBGN = totalCostVegetables + totalCostFruits;

        // Converting BGN to Euros
        double totalCostEuros = totalCostBGN / 1.94;

        // Printing the result
        System.out.printf("%.2f", totalCostEuros);
    }
}
