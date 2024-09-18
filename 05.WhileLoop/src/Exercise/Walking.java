package Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000; // Цел: 10 000 стъпки
        int totalSteps = 0; // Общо стъпки, извървяни през деня

        while (totalSteps < goal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                totalSteps += stepsToHome;
                break;
            } else {
                int steps = Integer.parseInt(input);
                totalSteps += steps;
            }
        }

        if (totalSteps >= goal) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!%n", totalSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.%n", goal - totalSteps);
        }
    }
}
