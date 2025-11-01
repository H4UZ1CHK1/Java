package com.example.domain;

public class Manager extends EmployeeBase {
    private int teamSize;

    public Manager(int id, String name, double baseSalary, int teamSize) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    @Override
    public void work() {
        System.out.println(getName() + " управляет командой из " + teamSize + " человек");
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + 50.0 * Math.max(teamSize, 0);
    }

    @Override
    public String toString() {
        return super.toString() + ", размер команды=" + teamSize + "}";
    }
}
