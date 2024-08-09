package Weekend_01;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());

        int hoursForOneProject = 3;
        int totalHours = countProjects * hoursForOneProject;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalHours, countProjects);

    }
}
