public class Main {
    public static void main(String[] args) {
        try {
            Company company = new Company("Example LLC");
            Department it = new Department("IT Department");
            company.addDepartment(it);

            StaffEmployee ivan = new StaffEmployee("Ivan Ivanov", "Developer", 2000, 500);
            ContractEmployee petr = new ContractEmployee("Petr Petrov", "QA", 1800);
            it.addEmployee(ivan);
            it.addEmployee(petr);

            System.out.println("Ivan salary (staff): " + ivan.calculateSalary());
            System.out.println("Petr salary (contract): " + petr.calculateSalary());

            StaffEmployee egor = new StaffEmployee("Egor Egorov", "Analyst", 2200, -300);
            System.out.println("Egor salary (staff, negative bonus): " + egor.calculateSalary());

            try {
                Employee bad = new ContractEmployee("Zero Guy", "Trainee", -100);
                System.out.println("Trainee salary: " + bad.calculateSalary());
            } catch (SalaryException se) {
                System.err.println("Cannot create employee – negative base salary: " + se.getBadSalary());
                throw se;
            }

        } catch (SalaryException seOuter) {
            System.out.println("Outer handling of SalaryException: " + seOuter.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
