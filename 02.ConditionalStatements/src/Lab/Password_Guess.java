package Lab;

import java.util.Objects;
import java.util.Scanner;

public class Password_Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guess = scanner.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if (Objects.equals(guess, password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
