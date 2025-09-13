class Employee {
    
    private static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    
    private String name;
    private final int id;     
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;               
        this.id = id;                   
        this.designation = designation;
        totalEmployees++;               
    }
    public void displayEmployeeDetails() {
        
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName +
                               ", Name: " + name +
                               ", ID: " + id +
                               ", Designation: " + designation);
        } else {
            System.out.println("Not a valid Employee object!");
        }
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class Employees{
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Akshat", 101, "Software Engineer");
        Employee e2 = new Employee("Ravi", 102, "Data Analyst");
        Employee e3 = new Employee("Priya", 103, "Project Manager");

        
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();

        
        Employee.displayTotalEmployees();

        
        if (e1 instanceof Employee) {
            System.out.println("e1 is an instance of Employee class.");
        }
    }
}
