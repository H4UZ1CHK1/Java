public class ContractEmployee extends Employee {
    private double contractCoeff = 1.0;

    public ContractEmployee(String fullName, String position, double baseSalary) throws SalaryException {
        super(fullName, position, baseSalary);
    }

    public double getContractCoeff() {
        return contractCoeff;
    }
    public void setContractCoeff(double contractCoeff) {
        this.contractCoeff = contractCoeff;
    }

    @Override
    public double calculateSalary() {
        try {
            return getBaseSalary() * contractCoeff;
        } catch (Exception e) {
            System.out.println("Error while calculating salary (contract): " + e.getMessage());
            return 0.0;
        }
    }
}
