package librarymanagementLab;

public class Main {
    public static void main(String[] args) {

        LibraryItem library = new LibraryItem("Java", "Non-Fiction", 12, 150, 200);
        System.out.println("Books in the library:" + library.getBookId() + " " + library.getTitle() + " "
                + library.getCategory() + " " + library.getRackNo());
    }
}