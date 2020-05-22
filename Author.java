public class Author {
    private String authorName;
    // creating has-a relationship with Publishing company
    private PublishingCompany publisher;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public PublishingCompany getPublisher() {
        return publisher;
    }

    public void setPublisher(PublishingCompany publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return getAuthorName();
    }

}