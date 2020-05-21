package librarymanagementLab;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // instantiate object
        // Books book = new Book(title, Author, category, bookId, rackNo, numberOfPages,
        // dueDate, checkedOut);

        // Add books to the list
        List<LibraryItem> books = new ArrayList<>();

        books.add(new LibraryItem("The Alchemist", "Paulo Coelho", "Fiction", 1, 5, 200));
        books.add(new LibraryItem("Harry Potter and the Soccerer stone", "J.K.Rowling", "Fiction", 2, 3, 200));
        books.add(new LibraryItem("Winnie The Pooh", "A.A.Milne", "Fiction", 3, 3, 20));
        books.add(new LibraryItem("Becoming ", "Michelle Obama", "Biography", 4, 2, 150));

        System.out.println("\nBooks item list\n");
        System.out.println("ID BOOK-TITLE    CATEGORY RACK-NO. ");
        for (LibraryItem str : books) {
            System.out.println(str + ", ");

        }
    }
}