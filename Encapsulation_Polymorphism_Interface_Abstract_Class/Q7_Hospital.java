interface Billable{double calculateBill();}
abstract class Patient{
    private String n;
    public Patient(String n1){n=n1;}
    public String getName(){return n;}
}
class InPatient extends Patient implements Billable{
    private int d;private double r;
    public InPatient(String n,int d1,double r1){super(n);d=d1;r=r1;}
    public double calculateBill(){return d*r;}
}
class OutPatient extends Patient{
    public OutPatient(String n){super(n);}
}
public class Q7_Hospital{
    public static void main(String[] args){
        Billable p=new InPatient("John",5,2000);System.out.println(p.calculateBill());
        Patient q=new OutPatient("Mary");System.out.println(q.getName());
    }
}