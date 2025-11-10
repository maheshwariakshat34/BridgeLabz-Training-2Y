import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>(); 
        grades.put("Alice", 85.0);
        grades.put("Bob", 90.0);
        grades.put("Charlie", 78.5);

        grades.put("Alice", 88.0);
        grades.remove("Charlie");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
