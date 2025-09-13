class Book{
    String title;
    int publicationYear;
    Book(String t,int y)
    {title=t;publicationYear=y;}
    void displayInfo()
    {System.out.println("Title:"+title+" Year:"+publicationYear);}
}
class Author extends Book{
    String name;
    String bio;
    Author(String title,int year,String name,String bio)
    {super(title,year);this.name=name;this.bio=bio;}
    @Override void displayInfo(){System.out.println("Book:"+title+" Year:"+publicationYear+" Author:"+name+" Bio:"+bio);}    
}
public class LibraryManagement{
    public static void main(String[] args){
        Author a = new Author("Java Fundamentals",2024,"Sam Smith","Software engineer");
        a.displayInfo();
    }
}