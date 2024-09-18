package Lab;

import java.util.Scanner;

public class Sum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, magicNumber);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
    }
}
