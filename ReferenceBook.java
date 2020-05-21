package librarymanagementLab;

import java.sql.Date;

public class ReferenceBook extends Book {
    private boolean isReferenceOnly;

    public ReferenceBook(String title, String Author, String category, int bookId, int rackNo, int numberOfPages,
            Date dueDate, boolean checkedOut) {
        super(title, Author, category, bookId, rackNo, numberOfPages, dueDate, checkedOut);

    }

    // check if the book is for reference only or can be checked out
    public boolean checkOut(String bookId) {
        if (isReferenceOnly) {
            System.out.println("This book is for reference only and cannot be checked out");
        }
        return isReferenceOnly;

    }

}