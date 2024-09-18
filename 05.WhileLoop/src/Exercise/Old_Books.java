package Exercise;

import java.util.Scanner;

public class Old_Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookToFind = scanner.nextLine();
        int checkedBooks = 0;

        String currentBook = scanner.nextLine();
        while(!currentBook.equals("No More Books")) {
            if (currentBook.equals(bookToFind)) {
                System.out.printf("You checked %d books and found it.", checkedBooks);
                return;
            }
            checkedBooks++;
            currentBook = scanner.nextLine();
        }

        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", checkedBooks);
    }
}
