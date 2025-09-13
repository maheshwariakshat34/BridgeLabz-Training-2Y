class Book {
    
    private static String libraryName = "City Central Library";

    
    private String title;
    private String author;
    private final String isbn;  

    
    public Book(String title, String author, String isbn) {
        this.title = title;     
        this.author = author;
        this.isbn = isbn;       
    }

    
    public void displayBookDetails() {
    
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName +
                               ", Title: " + title +
                               ", Author: " + author +
                               ", ISBN: " + isbn);
        } else {
            System.out.println("Not a valid Book object!");
        }
    }

    
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class Library{
    public static void main(String[] args) {
    
        Book.displayLibraryName();
        Book b1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        
        b1.displayBookDetails();
        b2.displayBookDetails();

    
        if (b1 instanceof Book) {
            System.out.println("b1 is indeed a Book object.");
        }
    }
}
