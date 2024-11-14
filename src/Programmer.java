public class Programmer extends Employee {
    protected String name;
    protected String address;
    protected int salary;
    protected String jobTitle;

    public Programmer(String name, String address, int salary, String jobTitle,
                      int startDate, int endDate) {
        super(startDate, endDate, "Programmer");
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}