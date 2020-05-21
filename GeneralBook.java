package librarymanagementLab;

import java.sql.Date;

public class GeneralBook extends Book {

    public GeneralBook(String title, String category, int bookId, int rackNo, int numberOfPages, Date dueDate) {
        super(title, category, bookId, rackNo, numberOfPages, dueDate);

    }

}