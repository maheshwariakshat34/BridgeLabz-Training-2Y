class Person {
    private String name;
    private int age;

    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstructor{
    public static void main(String[] args) {
        
        Person p1 = new Person("Akshat", 25);
        System.out.println("Original Person:");
        p1.displayDetails();

        
        Person p2 = new Person(p1);
        System.out.println("Copied Person:");
        p2.displayDetails();
    }
}
