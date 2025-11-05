import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private final List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public void addDepartment(Department d) {
        if (d != null) departments.add(d);
    }

    public List<Department> getDepartments() { return departments; }
}
