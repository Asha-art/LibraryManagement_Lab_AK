package librarymanagementLab;

public class CardHolder {
    private String memberName, memberAddress, dateOfMembership;
    private int memberId, overDue;

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

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getOverDue() {
        return overDue;
    }

    public void setOverDue(int overDue) {
        this.overDue = overDue;
    }

}