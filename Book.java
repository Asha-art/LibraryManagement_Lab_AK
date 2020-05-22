//package librarymanagementLab;

public class Book extends LibraryItem implements Loanable, Reservable {

    // private Date dueDate;
    private boolean checkedOut;

    public Book(String title, String Author, String category, int bookId, int rackNo, int numberOfPages,
            boolean checkedOut, Author authorname) {
        super(title, Author, category, bookId, rackNo, numberOfPages, authorname);

        this.checkedOut = checkedOut;
    }

    // Getters and Setters

    public boolean getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    // if the book has been checkedout

    public boolean isCheckedOut() {
        if (getCheckedOut()) {
            return true;
        } else {

            return false;
        }

    }

    // Overriding method
    @Override

    public String toString() {
        return getBookId() + " " + getTitle() + " " + getCategory() + " " + getRackNo();
    }

    // interface methods Reservable and Loaneable
    @Override
    public int getReservableBooks() {
        return 25;
    }

    @Override
    public boolean isLoanable() {
        return true;
    }

    @Override
    public int getLoanablePeriod() {
        return 15;
    }

    public void lateCharge(int lateCharge) {
        System.out.println("Daily late charge is  " + lateCharge + "cents");
    }

    @Override
    public int getLoaneablePeriod() {
        // TODO Auto-generated method stub
        return 0;
    }

}