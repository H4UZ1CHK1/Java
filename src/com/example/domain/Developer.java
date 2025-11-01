package com.example.domain;

public class Developer extends EmployeeBase {
    private String primaryLanguage;

    public Developer(int id, String name, double baseSalary, String primaryLanguage) {
        super(id, name, baseSalary);
        this.primaryLanguage = primaryLanguage;
    }

    public String getPrimaryLanguage() { return primaryLanguage; }
    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет код на языке " + primaryLanguage);
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() * 1.20;
    }

    @Override
    public String toString() {
        return super.toString() + ", основной язык = '" + primaryLanguage + "'}";
    }
}
