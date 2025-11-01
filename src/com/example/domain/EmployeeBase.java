package com.example.domain;

public abstract class EmployeeBase {
    private int id;
    private String name;
    private double baseSalary;

    public EmployeeBase(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract void work();

    public double calculatePay() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{идентификатор=" + id
                + ", имя='" + name + '\''
                + ", базовая зарплата=" + baseSalary
                + '}';
    }
}
