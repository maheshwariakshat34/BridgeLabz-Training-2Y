import java.util.*;

public class StudentAttendence {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        Map<String, Integer> attendance = new HashMap<>();

        for (String s : students) attendance.put(s, 0);

        Random rand = new Random();
        for (int day = 1; day <= 15; day++) {
            System.out.println("Day " + day + " attendance:");
            for (String s : students) {
                if (rand.nextBoolean()) { // Randomly mark present
                    attendance.put(s, attendance.get(s) + 1);
                    System.out.print(s + " ");
                }
            }
            System.out.println("\n");
        }

        System.out.println("Final Attendance: " + attendance);

        System.out.println("\nStudents with < 10 days attendance:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10) {
                System.out.println(e.getKey() + " (" + e.getValue() + " days)");
            }
        }
    }
}

