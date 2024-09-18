package Lab;

import java.util.Objects;
import java.util.Scanner;

public class Area_of_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (Objects.equals(figure, "square")) {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * side);
        } else if (Objects.equals(figure, "rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", sideA * sideB);
        } else if (Objects.equals(figure, "circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", radius * radius * Math.PI);
        } else if (Objects.equals(figure, "triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (sideA * sideB) / 2);
        }
    }
}
