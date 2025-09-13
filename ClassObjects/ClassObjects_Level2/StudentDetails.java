import java.util.Scanner;
class Student{
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name ,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;

    }
    public char calculateGrade(){
        if(marks>=90){
            return 'A';
        }else if(marks >=80 && marks <=89){
            return 'B';
        }else if(marks >=70 && marks <=79){
            return 'C';
        }else{
            return 'D';
        }
    }
    public void displayDetails(){
        System.out.println("Name of the student : " + name);
        System.out.println("Roll number : " + rollNumber);
        System.out.println("Marks of the student : " + marks);
        System.out.println("GRADE : " + calculateGrade());

    }
}
public class StudentDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name of the student : ");
        String n=sc.nextLine();
        System.out.print("enter the roll number : ");
        int r=sc.nextInt();
        sc.nextLine();
        System.out.print("enter the marks of the studnet : ");
        int m=sc.nextInt();

        Student student=new Student(n,r,m);
        student.displayDetails();

    }
}
    



