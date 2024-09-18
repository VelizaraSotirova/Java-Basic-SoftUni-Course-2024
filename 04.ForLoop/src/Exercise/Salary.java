package Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openTabs = scanner.nextInt();
        int salary = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= openTabs; i++) {
            String tabName = scanner.nextLine();

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }

            if ("Facebook".equals(tabName)) {
                salary -= 150;
            } else if ("Instagram".equals(tabName)) {
                salary -= 100;
            } else if ("Reddit".equals(tabName)) {
                salary -= 50;
            }
        }

        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
