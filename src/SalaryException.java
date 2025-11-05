public class SalaryException extends Exception {
    private final double badSalary;

    public SalaryException(String message, double badSalary) {
        super(message);
        this.badSalary = badSalary;
    }

    public double getBadSalary() {
        return badSalary;
    }
}
