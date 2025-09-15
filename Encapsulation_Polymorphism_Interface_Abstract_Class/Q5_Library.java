interface Borrowable{void borrow();}
abstract class Item{
    private String t;
    public Item(String t1){t=t1;}
    public String getTitle(){return t;}
}
class Book extends Item implements Borrowable{
    public Book(String t){super(t);}
    public void borrow(){System.out.println(getTitle()+" borrowed");}
}
class Magazine extends Item{
    public Magazine(String t){super(t);}
}
public class Q5_Library{
    public static void main(String[] args){
        Borrowable b=new Book("Java Programming");b.borrow();
        Item m=new Magazine("Tech Today");System.out.println(m.getTitle());
    }
}