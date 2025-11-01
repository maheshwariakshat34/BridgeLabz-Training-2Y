import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Akshat Sharma", 101);
        Faculty faculty = new Faculty("Dr. Mehta", "Computer Science");

        System.out.println("=== College Details ===");
        student.displayStudentDetails();
        System.out.println();
        faculty.displayFacultyDetails();
    }
}
