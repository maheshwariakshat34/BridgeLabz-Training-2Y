import java.util.ArrayList;
import java.util.Scanner;

// Represents a single item in the cart
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}


class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    // Add item
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.getItemName() + " added to cart.");
    }

    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemName().equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    
    public void displayTotalCost() {
        double total = 0;
        System.out.println("\n--- Cart Details ---");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart & Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(new CartItem(name, price, qty));
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayTotalCost();
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

