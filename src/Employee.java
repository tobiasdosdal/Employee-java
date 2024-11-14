public abstract class Employee {
    protected int startDate;
    protected int endDate;
    protected String title;

    public Employee(int startDate, int endDate, String title) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }
}