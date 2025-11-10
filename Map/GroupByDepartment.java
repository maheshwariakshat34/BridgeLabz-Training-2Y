import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> group = new HashMap<>();

        for (Employee e : employees) {
            group.putIfAbsent(e.department, new ArrayList<>());
            group.get(e.department).add(e);
        }

        System.out.println(group);
    }
}
