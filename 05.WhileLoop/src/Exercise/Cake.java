package Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int piecesCount = length * width;
        String command = scanner.nextLine();
        while (!"STOP".equals(command)) {
            int pieces = Integer.parseInt(command);

            if (piecesCount - pieces <= 0) {
                int diff = pieces - piecesCount;
                System.out.printf("No more cake left! You need %d pieces more.", diff);
                return;
            }

            piecesCount -= pieces;

            command = scanner.nextLine();
        }

        System.out.printf("%d pieces are left.", piecesCount);
    }
}
