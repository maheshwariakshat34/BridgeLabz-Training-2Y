import java.util.*;

public class WebsiteTracker {
    public static void main(String[] args) {
        String[] visits = {"home", "about", "products", "home", "products", "contact", "home", "home", "products"};

        Map<String, Integer> pages = new HashMap<>();

        for (String page : visits) {
            pages.put(page, pages.getOrDefault(page, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(pages.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Pages sorted by visit count:");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        Map.Entry<String, Integer> top = list.get(0);
        System.out.println("\nMost visited page: " + top.getKey() + " (" + top.getValue() + " visits)");
    }
}

