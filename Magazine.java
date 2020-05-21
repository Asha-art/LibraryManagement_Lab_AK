package librarymanagementLab;

public class Magazine extends Periodical {

    String weekly, monthly;

    public Magazine(String title, String category, int bookId, int rackNo, int numberOfPages, String weekly,
            String monthly) {
        super(title, category, bookId, rackNo, numberOfPages);
        this.weekly = weekly;
        this.monthly = monthly;

    }

    // Getters and Setters
    public String getWeekly() {
        return weekly;
    }

    public void setWeekly(String weekly) {
        this.weekly = weekly;
    }

    public String getMonthly() {
        return monthly;
    }

    public void setMonthly(String monthly) {
        this.monthly = monthly;
    }

}