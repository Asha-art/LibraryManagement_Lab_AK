//package librarymanagementLab;

public class GeneralBook extends Book {

    public GeneralBook(String title, String Author, String category, int bookId, int rackNo, int numberOfPages,
            boolean checkedOut, Author authorname) {
        super(title, Author, category, bookId, rackNo, numberOfPages, checkedOut, authorname);

        // checking whether the book is checked out method is from parent class
        // super.isCheckedOut(getCheckedOut());

    }

}