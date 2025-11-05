public class StaffEmployee extends Employee {
    private double bonus;

    public StaffEmployee(String fullName, String position, double baseSalary, double bonus) throws SalaryException {
        super(fullName, position, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new BonusException("Bonus cannot be negative: " + bonus);
            }
            return getBaseSalary() + bonus;
        } catch (BonusException be) {
            System.out.println("Bonus error: " + be.getMessage());
            return getBaseSalary();
        } catch (Exception e) {
            System.out.println("Error while calculating salary (staff): " + e.getMessage());
            return 0.0;
        }
    }
}
