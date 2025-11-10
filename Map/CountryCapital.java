import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>(); 

        countries.put("India", "New Delhi");
        countries.put("USA", "Washington D.C.");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Berlin");
        countries.put("Canada", "Ottawa");
        countries.put("Brazil", "Brasilia");
        countries.put("Australia", "Canberra");

        String input = "India";
        if (countries.containsKey(input)) {
            System.out.println("Capital of " + input + ": " + countries.get(input));
        } else {
            System.out.println("Unknown country");
        }

        System.out.println("\nAll countries and capitals:");
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

