interface Interest{double calculateInterest(double a);}
abstract class Account{
    private String acc;
    public Account(String a){acc=a;}
    public String getAccNo(){return acc;}
    public abstract double getBalance();
}
class SavingsAccount extends Account implements Interest{
    private double bal;
    public SavingsAccount(String a,double b){super(a);bal=b;}
    public double getBalance(){return bal;}
    public double calculateInterest(double amt){return amt*0.04;}
}
class CurrentAccount extends Account{
    private double bal;
    public CurrentAccount(String a,double b){super(a);bal=b;}
    public double getBalance(){return bal;}
}
public class Q4_BankingSystem{
    public static void main(String[] args){
        Account a1=new SavingsAccount("S101",50000);
        Account a2=new CurrentAccount("C101",30000);
        System.out.println("Savings Balance "+a1.getBalance());
        System.out.println("Interest "+((Interest)a1).calculateInterest(a1.getBalance()));
        System.out.println("Current Balance "+a2.getBalance());
    }
}