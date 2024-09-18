package Exercise;

import java.util.Scanner;

public class Exam_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsatisfactoryGrade = Integer.parseInt(scanner.nextLine());

        int numberOfProblems = 0;
        int unsatisfactoryExercises = 0;
        double averageScore = 0;
        String exerciseName = "";
        String input = scanner.nextLine();
        boolean flag = false;

        while(!input.equals("Enough")) {
            exerciseName = input;
            int grade = Integer.parseInt(scanner.nextLine());
            numberOfProblems++;

            if (grade <= 4.00) {
                unsatisfactoryExercises++;
                if (unsatisfactoryExercises == unsatisfactoryGrade) {
                    flag = true;
                    break;
                }
            }

            averageScore += grade;

            input = scanner.nextLine();
        }

        if(flag) {
            System.out.printf("You need a break, %d poor grades.", unsatisfactoryGrade);
        } else {
            averageScore /= numberOfProblems;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s", exerciseName);
        }
    }
}
