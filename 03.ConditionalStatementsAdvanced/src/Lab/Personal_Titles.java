package Lab;

import java.util.Objects;
import java.util.Scanner;

public class Personal_Titles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double years = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        if (years < 16) {
            if (Objects.equals(sex, "m")) {
                System.out.println("Master");
            } else if (Objects.equals(sex, "f")) {
                System.out.println("Miss");
            }
        } else {
            if (Objects.equals(sex, "m")) {
                System.out.println("Mr.");
            } else if (Objects.equals(sex, "f")) {
                System.out.println("Ms.");
            }
        }
    }
}
