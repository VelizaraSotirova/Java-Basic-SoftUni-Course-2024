package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на името на ученика
        String studentName = scanner.nextLine();

        int grade = 1; // Започваме от 1-ви клас
        int failedYears = 0; // Брой години, в които ученикът е бил скъсан
        double sumGrades = 0.0; // Сума от всички оценки
        boolean isExcluded = false; // Флаг за проверка дали ученикът е изключен

        while (grade <= 12) {
            // Прочитане на годишната оценка
            double annualGrade = Double.parseDouble(scanner.nextLine());

            if (annualGrade < 4.00) {
                failedYears++;
                if (failedYears > 1) {
                    isExcluded = true;
                    break;
                }
            } else {
                sumGrades += annualGrade;
                grade++;
            }
        }

        // Проверка дали ученикът е завършил успешно или е изключен
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade%n", studentName, grade);
        } else {
            double averageGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", studentName, averageGrade);
        }
    }
}
