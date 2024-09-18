package Lab;

import java.util.Scanner;

public class Min_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num < minNum) {
                minNum = num;
            }
            input = scanner.nextLine();
        }

        System.out.println(minNum);
    }
}
