//package librarymanagementLab;

import java.sql.Date;

public class Book extends LibraryItem implements Loanable, Reservable {

    private Date dueDate;
    private boolean checkedOut;

    public Book(String title, String Author, String category, int bookId, int rackNo, int numberOfPages, Date dueDate,
            boolean checkedOut) {
        super(title, Author, category, bookId, rackNo, numberOfPages);
        this.dueDate = dueDate;
        this.checkedOut = checkedOut;
    }

    // Getters and Setters
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date date) {
        this.dueDate = date;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    // if the book has been checkedout

    public boolean isCheckedOut(boolean checkedOut) {
        if (checkedOut) {
            return true;
        } else {
            return false;
        }
    }

    // Overriding method
    @Override

    public String toString() {
        return getBookId() + " " + getTitle() + " " + getCategory() + " " + getRackNo() + " " + getDueDate();
    }

    // interface methods Reservable and Loaneable
    @Override
    public int getReservableBooks() {
        return 25;
    }

    @Override
    public int getLoneableBooks() {
        return 20;
    }

    @Override
    public int getLoaneablePeriod() {
        return 15;
    }

}