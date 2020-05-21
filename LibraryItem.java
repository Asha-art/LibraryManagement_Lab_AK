package librarymanagementLab;

import java.util.ArrayList;
import java.util.List;

public class LibraryItem {
    public String libraryName = "CMS library";
    public String libraryAddress = "Charlotte";
    private String title, category;
    // private String author, publisher;
    private int bookId, rackNo, numberOfPages;

    List<String> books = new ArrayList<String>();

    LibraryItem library = new LibraryItem("Java", "Non-Fiction", 12, 150, 200);

    public LibraryItem(String title, String category, int bookId, int rackNo, int numberOfPages) {
        this.title = title;
        this.category = category;
        this.bookId = bookId;
        this.rackNo = rackNo;
        this.numberOfPages = numberOfPages;
        System.out.println(" Welcome to " + libraryName + libraryAddress);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getRackNo() {
        return rackNo;
    }

    public void setRackNo(int rackNo) {
        this.rackNo = rackNo;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // display books
    private static void printBookDetails(List<LibraryItem> books) {
        for (LibraryItem b : books) {
            System.out.println("Books in the library:" + b.getBookId() + " " + b.getTitle() + " " + b.getCategory()
                    + " " + b.getRackNo());
        }
    }

    public String toString() {

        return library.getBookId() + " " + library.getTitle() + " " + library.getCategory() + " " + library.getRackNo();
    }

}