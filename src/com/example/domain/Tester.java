package com.example.domain;

public class Tester extends EmployeeBase {
    private String tool;

    public Tester(int id, String name, double baseSalary, String tool) {
        super(id, name, baseSalary);
        this.tool = tool;
    }

    public String getTool() { return tool; }
    public void setTool(String tool) { this.tool = tool; }

    @Override
    public void work() {
        System.out.println(getName() + " тестирует программное обеспечение с помощью " + tool);
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", инструмент='" + tool + "'}";
    }
}
