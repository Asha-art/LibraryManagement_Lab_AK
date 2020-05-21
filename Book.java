package librarymanagementLab;

import java.sql.Date;

public class Book extends LibraryItem {

    private Date dueDate;

    public Book(String title, String category, int bookId, int rackNo, int numberOfPages, Date dueDate) {
        super(title, category, bookId, rackNo, numberOfPages);
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date date) {
        this.dueDate = date;
    }

}