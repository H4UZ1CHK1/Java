package com.example.domain;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Jane Smith", "012-34-5678", 120_345.27);

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());

        emp.raiseSalary(5000);
        System.out.println("Зарплата после повышения: " + emp.getSalary());

        emp.work();
    }
}

