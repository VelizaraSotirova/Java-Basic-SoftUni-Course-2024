package Exercise;

import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            String currNum = "" + i;
            int evenSum = 0;
            int oddSum =0;

            for (int j = 0; j < currNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currNum.charAt(j));
                if ( j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }

            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }

    }
}
