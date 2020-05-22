import java.util.ArrayList;
import java.util.List;

//package librarymanagementLab;

public class CardHolder {
    private String memberName, memberAddress, dateOfMembership, booksCheckedOut, overDueBooks;
    private int memberId, lateFee;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(String dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public String getBooksCheckedOut() {
        return booksCheckedOut;
    }

    public void setBooksCheckedOut(String booksCheckedOut) {
        this.booksCheckedOut = booksCheckedOut;
    }

    public String getOverDueBooks() {
        return overDueBooks;
    }

    public void setOverDueBooks(String overDueBooks) {
        this.overDueBooks = overDueBooks;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getLateFee() {
        return lateFee;
    }

    public void setLateFee(int lateFee) {
        this.lateFee = lateFee;
    }

    // List<Books> list1 = new ArrayList<>();

    // List<Periodicals> list2 = new ArrayList<>();

    // List<Multimedia> books = new ArrayList<>();
}