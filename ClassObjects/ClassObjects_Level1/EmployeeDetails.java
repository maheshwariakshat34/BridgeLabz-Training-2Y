import java.util.Scanner;
class Employee{
    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Employee id: "+id);
        System.out.println("Employeee name "+name );
        System.out.println("Employee Salary "+salary);
    }
}

public class EmployeeDetails{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of employeess ");
    int n=sc.nextInt();
     Employee[] employees = new Employee[n];
     for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
          employees[i] = new Employee(name, id, salary);
    
     }
      System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        sc.close();
    }

}
 
    




