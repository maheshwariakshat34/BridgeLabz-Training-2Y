class Student{
    public int rollNumber;      
    protected String name;       
    private double CGPA;


    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0 and 10.");
        }
    }

    
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber +
                           ", Name: " + name +
                           ", CGPA: " + CGPA);
    }
}


class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }


    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student: " + name + 
                           ", Specialization: " + specialization);
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
    
        Student s1 = new Student(101, "Akshat", 8.5);
        s1.displayStudentDetails();

    
        System.out.println("Roll Number (direct): " + s1.rollNumber);

        
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Ravi", 9.2, "Computer Science");
        pg1.displayStudentDetails();
        pg1.displayPostgraduateDetails();
    }
}









