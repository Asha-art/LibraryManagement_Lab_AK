package librarymanagementLab;

import java.sql.Date;

public class ReferenceBook extends Book {
    private boolean isReferenceOnly;

    public ReferenceBook(String title, String category, int bookId, int rackNo, int numberOfPages, Date dueDate) {
        super(title, category, bookId, rackNo, numberOfPages, dueDate);
    }

    public boolean checkOut(String bookId) {
        if (isReferenceOnly) {
            System.out.println("This book is for reference only and cannot be checked out");
        }
        return isReferenceOnly;
    }
}