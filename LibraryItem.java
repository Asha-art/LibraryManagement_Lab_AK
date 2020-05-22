//package librarymanagementLab;

//import java.util.List;

public class LibraryItem {
    public String libraryName = "CMS library";
    public String libraryAddress = "Charlotte";
    private String title, Author, category;
    private int bookId, rackNo, numberOfPages;

    // relationship
    private Author authorname;

    public LibraryItem(String title, String Author, String category, int bookId, int rackNo, int numberOfPages,
            Author authorname) {
        this.title = title;
        this.category = category;
        this.bookId = bookId;
        this.rackNo = rackNo;
        this.numberOfPages = numberOfPages;
        this.authorname = authorname;
        // System.out.println(" Welcome to " + libraryName + ", " + libraryAddress);

    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
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

    // toString method to display books details
    public String toString() {
        return getBookId() + " " + getTitle() + " " + getCategory() + " " + getRackNo();
    }

    public Author getAuthorname() {
        return authorname;
    }

    public void setAuthorname(Author authorname) {
        this.authorname = authorname;
    }

}