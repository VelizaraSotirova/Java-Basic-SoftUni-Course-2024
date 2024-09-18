package Exercise;

import java.util.Objects;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double income = 0;
        int hallCapacity = rows * cols;

        if (Objects.equals(projection, "Premiere")) {
            income += hallCapacity * 12;
        } else if (Objects.equals(projection, "Normal")) {
            income += hallCapacity * 7.5;
        } else if (Objects.equals(projection, "Discount")) {
            income += hallCapacity * 5;
        }

        System.out.printf("%.2f leva", income);
    }
}
