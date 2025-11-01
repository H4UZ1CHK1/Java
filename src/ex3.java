import java.util.*;

public class ex3 {
    static abstract class Employee {
        protected int id;
        protected String name;
        public Employee(int id, String name) {
            this.id = id; this.name = name;
        }
        public int getId() {
            return id;
        }        public String getName() {
            return name;
        }
        public abstract double getAverageMonthlySalary();
    }

    static class FixedEmployee extends Employee {
        private final double monthlySalary;
        public FixedEmployee(int id, String name, double monthlySalary) {
            super(id, name);
            this.monthlySalary = monthlySalary;
        }
        @Override public double getAverageMonthlySalary() {
            return monthlySalary;
        }
    }

    static class HourlyEmployee extends Employee {
        private final double hourlyRate;
        public HourlyEmployee(int id, String name, double hourlyRate) {
            super(id, name);
            this.hourlyRate = hourlyRate;
        }
        @Override public double getAverageMonthlySalary() {
            return 26 * 8 * hourlyRate;
        }
    }

    public static void run() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedEmployee(1, "Alex",   2000));
        employees.add(new FixedEmployee(2, "Maria",  3000));
        employees.add(new HourlyEmployee(3, "Ivan",    25));
        employees.add(new HourlyEmployee(4, "Olga",    30));
        employees.add(new FixedEmployee(5, "Petr",   1500));
        employees.add(new HourlyEmployee(6, "Sergey",  20));
        employees.add(new HourlyEmployee(7, "Anna",    30));

        employees.sort((e1, e2) -> {
            double diff = e2.getAverageMonthlySalary() - e1.getAverageMonthlySalary();

            if (diff > 0) return 1;
            else if (diff < 0) return -1;
            else
                return e1.getName().compareTo(e2.getName());
        });

        System.out.println("Список сотрудников:");
        for (Employee e : employees) {
            System.out.printf("%d\t%s\t%.2f%n", e.getId(), e.getName(), e.getAverageMonthlySalary());
        }

        System.out.println("\nПервые 5 имён:");
        employees.stream().limit(5).forEach(e -> System.out.println(e.getName()));

        System.out.println("\nПоследние 3 ID:");

        int startIndex = employees.size() - 3;
        if (startIndex < 0) startIndex = 0;

        for (int i = startIndex; i < employees.size(); i++) {
            System.out.println(employees.get(i).getId());
        }

        System.out.println();
    }
}
