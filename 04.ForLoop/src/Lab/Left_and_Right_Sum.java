package Lab;

import java.util.Scanner;

public class Left_and_Right_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < n; i++) {
            leftSum += Integer.parseInt(scanner.nextLine());
        }
        for(int j = 0; j < n; j++) {
            rightSum += Integer.parseInt(scanner.nextLine());
        }

        if (leftSum - rightSum == 0) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
        }
    }
}
