//package librarymanagementLab;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Add books to the list
        List<LibraryItem> books = new ArrayList<>();

        books.add(new LibraryItem("The Alchemist", "Paulo Coelho", "Fiction", 1, 5, 20, new Author("Paulo Coelho")));
        books.add(new LibraryItem("Harry Potter and the Soccerer stone", "J.K.Rowling", "Fiction", 2, 3, 200,
                new Author("J.K.Rowling")));
        books.add(new LibraryItem("Winnie The Pooh", "A.A.Milne", "Fiction", 3, 3, 20, new Author("A.A.Milne")));
        books.add(new LibraryItem("Becoming ", "Michelle Obama", "Biography", 4, 2, 15, new Author("Michelle Obama")));

        System.out.println("\nBooks item list\n");
        System.out.println("ID BOOK-TITLE CATEGORY RACK-NO. ");
        for (LibraryItem str : books) {
            System.out.println(str + ", ");
        }
        Author a = new Author("J.K.Rowling");

        Loanable loan = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle", "Mystery", 6, 8, 300, true,
                new Author("J.K.Rowling"));
        System.out.println("\nNo. of days to loan book: " + loan.getLoanablePeriod());
        loan.lateCharge(15);

        // relationship between Author Publishing company and the library items
        LibraryItem library = new LibraryItem("Silent Spring", "Rachel Carson", "Non-Fiction", 9, 7, 190,
                new Author("Rachel Carson"));
        // System.out.println();
        PublishingCompany pub = new PublishingCompany("Scholastic");
        pub.setPublishingCompany("Scholastic");
        a.setPublisher(pub);

        System.out.println("\nAuthor: " + a.getAuthorName() + " \nPublishing Company: " + pub.getPublishingCompany());
        // System.out.println("Book and Authorname: " + library.getTitle() + ", " +
        // library.getAuthorname());

    }
}