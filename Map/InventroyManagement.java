import java.util.*;

public class InventroyManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

    
        inventory.put("Rice", 10);
        inventory.put("Sugar", 5);
        inventory.put("Salt", 0);
        inventory.put("Rice", inventory.get("Rice") - 3);
        if (inventory.get("Rice") <= 0) inventory.put("Rice", 0);

        inventory.put("Sugar", inventory.get("Sugar") + 10);
        String product = "Salt";
        if (inventory.containsKey(product)) {
            int qty = inventory.get(product);
            System.out.println(product + ": " + (qty == 0 ? "Out of Stock" : qty));
        } else {
            System.out.println("Not stocked");
        }
        System.out.println("\nOut of stock items:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
}
