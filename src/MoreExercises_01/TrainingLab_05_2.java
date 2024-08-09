package MoreExercises_01;

import java.util.Scanner;

public class TrainingLab_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // в метри
        double wM = Double.parseDouble(scanner.nextLine());
        double hM = Double.parseDouble(scanner.nextLine());

        // Преобразуване от метри в сантиметри
        double wCm = wM * 100;
        double hCm = hM * 100;


        double deskWidth = 70;
        double deskLength = 120;

        // Ширина на коридора
        double corridorWidth = 100;

        // Изчисляване на използваемата ширина
        double usableWidth = hCm - corridorWidth;

        // Изчисляване на броя на бюрата, които се побират по дължина и ширина
        int desksAlongLength = (int)(wCm / deskLength);
        int desksAlongWidth = (int)(usableWidth / deskWidth);

        // Общ брой бюра (изваждане на 3 за катедра и входна врата)
        int totalDesks = (desksAlongLength * desksAlongWidth) - 3;

        // Преобразуване на общия брой бюра в цяло число
        System.out.println(totalDesks);


    }
}
