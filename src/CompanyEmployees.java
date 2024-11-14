import java.util.ArrayList;

public class CompanyEmployees {
    private ArrayList<Programmer> programmers;

    public CompanyEmployees() {
        programmers = new ArrayList<>();
    }

    public void addProgrammer(Programmer programmer) {
        if (programmer != null) {
            programmers.add(programmer);
        }
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }
}