package NestedLoops_01;

public class Clock_01 {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++){
            for (int mins = 0; mins <= 59; mins++){
                System.out.printf("%d:%d%n", hour, mins);
            }
        }
    }
}
