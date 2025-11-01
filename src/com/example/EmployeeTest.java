package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec # " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());

        com.example.domain.EmployeeBase dev =
                new com.example.domain.Developer(201, "Алексей Навальный", 2000.0, "Java");
        com.example.domain.EmployeeBase tester =
                new com.example.domain.Tester(202, "Миа Халифа", 1800.0, "Selenium");
        com.example.domain.EmployeeBase manager =
                new com.example.domain.Manager(203, "Джонатан Уик", 3000.0, 3);

        com.example.domain.EmployeeBase[] team = { dev, tester, manager };
        for (var e : team) {
            System.out.println(e);
            System.out.println("Месячная зарплата: " + e.calculatePay());
            e.work();
            System.out.println();
        }
    }
}
