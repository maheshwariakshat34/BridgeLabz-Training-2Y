import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 48);
        courses.put("CS102", 3);
        courses.put("CS103", 60);
        courses.put("CS104", 10);
        courses.put("CS105", 2);

        // Add student
        courses.put("CS101", courses.get("CS101") + 1);

        // Drop student (no negative)
        String dropCourse = "CS102";
        courses.put(dropCourse, Math.max(0, courses.get(dropCourse) - 1));

        System.out.println("Courses near full (≥50):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50)
                System.out.println(e.getKey() + " (" + e.getValue() + " students)");
        }

        System.out.println("\nUnder-subscribed courses (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5)
                System.out.println(e.getKey() + " (" + e.getValue() + " students)");
        }
    }
}
