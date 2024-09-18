package Exercise;

import java.util.Scanner;

public class Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int result = 0;
        String evenOdd = "";

        if ("+".equals(operator)) {
            result = n1 + n2;
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%d %s %d = %d - %s", n1, operator, n2, result, evenOdd);
        } else if ("-".equals(operator)) {
            result = n1 - n2;
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%d %s %d = %d - %s", n1, operator, n2, result, evenOdd);
        } else if ("*".equals(operator)) {
            result = n1 * n2;
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
            System.out.printf("%d %s %d = %d - %s", n1, operator, n2, result, evenOdd);
        }

        double doubleRes = 0;
        if ("/".equals(operator)) {
            if (n2 != 0) {
                doubleRes = (double) n1 / n2;
                System.out.printf("%d / %d = %.2f", n1, n2, doubleRes);
            } else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        }

        if ("%".equals(operator)) {
            if (n2 != 0) {
                result = n1 % n2;
                System.out.printf("%d %s %d = %d", n1, operator, n2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        }
    }
}
