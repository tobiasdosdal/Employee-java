public class Main {
    public static void main(String[] args) {
        CompanyEmployees company = new CompanyEmployees();

        Programmer programmer = new Programmer(
                "Jens Viking",
                "Den sorte perle",
                50000,
                "Pirate",
                20240101,  // startDate
                20241231   // endDate
        );

        company.addProgrammer(programmer);

        System.out.println(programmer.getJobTitle()+ " " + programmer.getTitle());
    }
}