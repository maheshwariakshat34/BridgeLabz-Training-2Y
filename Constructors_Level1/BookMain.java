class Book{
    private String title;
    private String author;
    private double price;

    public Book(){
        this.title="Sapno ki Duniya";
        this.author="Akshat";
        this.price=501;

    }
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    public void displayDetails(){
        System.out.println("Title of the book : " + title);
        System.out.println("Author of the book : " + author);
        System.out.println("Price of the book : " + price);

    }


}
public class BookMain{
    public static void main(String[] args) {
        Book book1=new Book();
        book1.displayDetails();
        System.out.println();
        Book book2=new Book("Matlabi Duniya","Yo Yo Honey Singh",1101);
        book2.displayDetails();
        
    }
}