interface Bonus { 
    double calculateBonus();

}
abstract class Employee {
    private String name; 
    private int id; 
    private double baseSalary;


    public Employee(String n,int i,double s)
    {name=n;id=i;baseSalary=s;}
    public String getName()
    {return name;
    } 
    public int getId(){
        return id;
    } 
    public double getBaseSalary(){
        return baseSalary;
    }
    public abstract double calculateSalary();
}
class FullTimeEmployee extends Employee implements Bonus {
    public FullTimeEmployee(String n,int i,double s){
        super(n,i,s);
    }
    public double calculateSalary(){
        return getBaseSalary();
    }
    public double calculateBonus(){
        return 0.1*getBaseSalary();
    }
}
class PartTimeEmployee extends Employee {
    private int hours; private double rate;
    public PartTimeEmployee(String n,int i,double r,int h){
        super(n,i,0);rate=r;hours=h;
    }
    public double calculateSalary(){
        return hours*rate;
    }
}
public class Q1_EmployeeManagement {
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee("Alice",1,50000);
        Employee e2=new PartTimeEmployee("Bob",2,500,40);
        System.out.println(e1.getName()+" Salary "+e1.calculateSalary());
        System.out.println(e1.getName()+" Bonus "+((Bonus)e1).calculateBonus());
        System.out.println(e2.getName()+" Salary "+e2.calculateSalary());
    }
}