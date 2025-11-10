import java.util.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Alice", 55000.0);
        salaries.put("Bob", 72000.0);
        salaries.put("Carol", 68000.0);
        salaries.put("David", 50000.0);
        salaries.put("Eve", 90000.0);
        salaries.put("Frank", 72000.0);

        
        String employee = "Bob";
        if (salaries.containsKey(employee)) {
            double newSalary = salaries.get(employee) * 1.10;
            salaries.put(employee, newSalary);
        } else {
            System.out.println("Employee not found");
        }

        double total = 0;
        for (double s : salaries.values()) total += s;
        double avg = total / salaries.size();
        System.out.println("Average salary: " + avg);

    
        double maxSalary = Collections.max(salaries.values());
        System.out.println("Highest salary: " + maxSalary);

        System.out.println("Top earners:");
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            if (e.getValue() == maxSalary)
                System.out.println(e.getKey());
        }
    }
}
