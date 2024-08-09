package WhileLoop_WO4;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int countSteps = 0;

        while (!command.equals("Going home")){

            int currentSteps = Integer.parseInt(command);
            countSteps += currentSteps;

            if (countSteps > 10000){
                break;
            }

            command = scanner.nextLine();
        }


        if (command.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            countSteps += stepsToHome;
        }



        int diff = Math.abs(countSteps - 10000);


        if (countSteps >= 10000){
            System.out.printf("Goal reached! Good job!%n %d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}