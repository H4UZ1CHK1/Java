public abstract class Employee {
    private String fullName;
    private String position;
    private double baseSalary;

    public Employee(String fullName, String position, double baseSalary) throws SalaryException {
        if (baseSalary < 0) {
            throw new SalaryException("Base salary cannot be negative", baseSalary);
        }
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) throws SalaryException {
        if (baseSalary < 0) throw new SalaryException("Base salary cannot be negative", baseSalary);
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}
