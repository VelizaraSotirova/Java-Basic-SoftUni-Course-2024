package Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int roomVolume = height * width * length;
        String input = scanner.nextLine();
        while(!"Done".equals(input)) {
            int luggage = Integer.parseInt(input);

            if (roomVolume - luggage < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", luggage - roomVolume);
                return;
            }

            roomVolume -= luggage;
            input = scanner.nextLine();
        }

        System.out.printf("%d Cubic meters left.", roomVolume);
    }
}
