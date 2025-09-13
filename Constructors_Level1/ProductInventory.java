 class Product  {
    private static int totalProducts=0;
    private String productName;
    private double price;
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Smartphone", 20000);

        
        p1.displayProductDetails();
        p2.displayProductDetails();

        
        Product.displayTotalProducts();
    }
}    


    

