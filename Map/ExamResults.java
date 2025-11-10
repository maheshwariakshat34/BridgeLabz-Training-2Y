import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new HashMap<>();

        results.put("Math", Map.of("Alice", 85, "Bob", 92, "Carol", 88));
        results.put("Science", Map.of("Alice", 95, "Bob", 89, "Carol", 91));
        results.put("English", Map.of("Alice", 78, "Bob", 84, "Carol", 80));

        for (String subject : results.keySet()) {
            Map<String, Integer> subjectMarks = results.get(subject);

            // Topper
            String topper = "";
            int topScore = -1;
            int total = 0;

            for (Map.Entry<String, Integer> e : subjectMarks.entrySet()) {
                total += e.getValue();
                if (e.getValue() > topScore) {
                    topScore = e.getValue();
                    topper = e.getKey();
                }
            }

            double avg = total / (double) subjectMarks.size();

            System.out.println(subject + "  Topper: " + topper + " (" + topScore + "), Avg: " + avg);
        }

        // Subjects with scores above 90
        System.out.println("\nSubjects with at least one score above 90:");
        for (Map.Entry<String, Map<String, Integer>> e : results.entrySet()) {
            for (int score : e.getValue().values()) {
                if (score > 90) {
                    System.out.println(e.getKey());
                    break;
                }
            }
        }
    }
}
