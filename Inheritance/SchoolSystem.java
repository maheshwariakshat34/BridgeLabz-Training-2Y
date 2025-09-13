class Person{
    String name;
    int age;
    Person(String n,int a){name=n;age=a;}
}
class Teacher extends Person{
    String subject;
    Teacher(String n,int a,String s){super(n,a);subject=s;}
    void displayRole(){System.out.println("Teacher "+name+" Age:"+age+" Subject:"+subject);}
}
class Student extends Person{
    String grade;
    Student(String n,int a,String g){super(n,a);grade=g;}
    void displayRole(){System.out.println("Student "+name+" Age:"+age+" Grade:"+grade);}
}
class Staff extends Person{
    String position;
    Staff(String n,int a,String p){super(n,a);position=p;}
    void displayRole(){System.out.println("Staff "+name+" Age:"+age+" Position:"+position);}
}
public class SchoolSystem{
    public static void main(String[] args){
        Teacher t=new Teacher("Mrs. Lee",35,"Math");
        Student s=new Student("Tom",16,"10th");
        Staff st=new Staff("Jane",28,"Clerk");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}