import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private final List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeesCount() {
        return employees.size();
    }

    public void addEmployee(Employee e) {
        if (e != null) employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
