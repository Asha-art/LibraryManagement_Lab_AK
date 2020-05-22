public class OverdueList<E extends Book> {
    private E overdueItems;

    public OverdueList(E overdueItems) {
        this.overdueItems = overdueItems;
    }

    public E getOverdueItems() {
        return overdueItems;
    }

    public void setOverdueItems(E overdueItems) {
        this.overdueItems = overdueItems;
    }

}