package MoreExercises_01;

import java.util.Scanner;

public class TriangleArea_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //Използвайте формулата за лице на триъгълник: area = a * h / 2.
        //Форматирате изхода до втория знак след десетичната запетая.


        double area = (h * a) / 2;

        System.out.printf("%.2f", area);

    }
}
