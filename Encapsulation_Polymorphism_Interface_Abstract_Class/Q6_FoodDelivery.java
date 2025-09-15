interface Deliverable{void deliver();}
abstract class Food{
    private String n;
    public Food(String n1){n=n1;}
    public String getName(){return n;}
}
class Pizza extends Food implements Deliverable{
    public Pizza(String n){super(n);}
    public void deliver(){System.out.println(getName()+" delivered");}
}
class Burger extends Food{
    public Burger(String n){super(n);}
}
public class Q6_FoodDelivery{
    public static void main(String[] args){
        Deliverable d=new Pizza("Cheese Pizza");d.deliver();
        Food f=new Burger("Veg Burger");System.out.println(f.getName());
    }
}