class Product {
    private static double discount = 10.0; 
    private final int productID;          
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;       
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            double total = price * quantity;
            double discounted = total - (total * discount / 100);
            System.out.println("Product ID: " + productID +
                               ", Name: " + productName +
                               ", Price: " + price +
                               ", Quantity: " + quantity +
                               ", Total after " + discount + "% discount: " + discounted);
        }
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to " + discount + "%");
        }
    }
}

public class Shopping {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Headphones", 2000, 2);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.updateDiscount(20);

        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
