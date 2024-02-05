import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public void removeSubordinate(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee :[ Name : ").append(name)
                .append(", position : ").append(position)
                .append(", salary : ").append(salary).append(" ]\n");
        for (Employee subordinate : subordinates) {
            sb.append("   ").append(subordinate.toString());
        }
        return sb.toString();
    }
}
