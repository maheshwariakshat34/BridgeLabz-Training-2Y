interface Discount{
    double applyDiscount(double p);
}
abstract class Product{
    private String name;
    private double price;
    public Product(String n,double p){
        name=n;price=p;
    }
    public String getName(){
        return name;
    } 
    public double getPrice(){
        return price;
    }
    public abstract double finalPrice();
}
class Electronics extends Product implements Discount{
    public Electronics(String n,double p){
        
        super(n,p);
    }
    public double finalPrice(){
        return getPrice();
    }
    public double applyDiscount(double p){
        return p*0.9;
    }
}
class Clothing extends Product{
    private double d;
    public Clothing(String n,double p,double d1){
        super(n,p);d=d1;
    }
    public double finalPrice(){
        return getPrice()*(1-d);
    }
}
public class Q2_ECommerce{
    public static void main(String[] args){
        Product p1=new Electronics("Laptop",60000);
        Product p2=new Clothing("Shirt",2000,0.2);
        System.out.println(p1.getName()+" Price "+((Discount)p1).applyDiscount(p1.getPrice()));
        System.out.println(p2.getName()+" Price "+p2.finalPrice());
    }
}