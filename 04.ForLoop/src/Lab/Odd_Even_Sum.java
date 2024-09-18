package Lab;

import java.util.Scanner;

public class Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <n; i++) {
            if(i % 2 == 0) {
                evenSum += scanner.nextInt();
            } else {
                oddSum += scanner.nextInt();
            }
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddSum-evenSum));
        }
    }
}
