import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>(); 
        books.put("978-1234567890", "Java Programming");
        books.put("978-9876543210", "Data Structures");
        books.put("978-5555555555", "Algorithms");

    
        String isbn = "978-9876543210";
        if (books.containsKey(isbn)) {
            System.out.println("Book found: " + books.get(isbn));
        } else {
            System.out.println("Book not found");
        }
        books.remove("978-5555555555");
        System.out.println("\nBook Catalog:");
        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        String title = "Java Programming";
        boolean found = false;
        for (Map.Entry<String, String> entry : books.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("\nFound ISBN for " + title + ": " + entry.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("\nBook not found by title");
    }
}

