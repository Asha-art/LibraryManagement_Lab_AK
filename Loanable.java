interface Loanable {

    boolean isLoanable();

    int getLoanablePeriod();

    public void lateCharge(int lateCharge);
}