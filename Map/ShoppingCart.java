import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 800.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Monitor", 10000.0);
        cart.put("Headphones", 2000.0);

        System.out.println("Products in cart (in order):");
        for (Map.Entry<String, Double> e : cart.entrySet()) {
            System.out.println(e.getKey() + " → ₹" + e.getValue());
        }

        double total = 0;
        for (double price : cart.values()) total += price;

        if (total > 5000) total *= 0.9;
        System.out.println("\nTotal after discount (if any): ₹" + total);

        cart.remove("Mouse");
        System.out.println("\nCart after removing Mouse: " + cart);
    }
}

