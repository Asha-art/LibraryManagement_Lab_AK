package librarymanagementLab;

import java.sql.Date;

public class GeneralBook extends Book {

    public GeneralBook(String title, String Author, String category, int bookId, int rackNo, int numberOfPages,
            Date dueDate, boolean checkedOut) {
        super(title, Author, category, bookId, rackNo, numberOfPages, dueDate, checkedOut);

        // checking whether the book is checked out method is from parent class
        super.isCheckedOut(getCheckedOut());

    }

}