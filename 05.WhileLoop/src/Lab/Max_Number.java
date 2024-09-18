package Lab;

import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num > maxNum) {
                maxNum = num;
            }
            input = scanner.nextLine();
        }

        System.out.println(maxNum);
    }
}
