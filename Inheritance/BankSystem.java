class BankAccount{
    String accountNumber;
    double balance;
    BankAccount(String a,double b){accountNumber=a;balance=b;}
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(String a,double b,double r){super(a,b);interestRate=r;}
    void displayAccountType(){System.out.println("Savings "+accountNumber+" Balance:"+balance+" Interest:"+interestRate);}
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(String a,double b,double l){super(a,b);withdrawalLimit=l;}
    void displayAccountType(){System.out.println("Checking "+accountNumber+" Balance:"+balance+" Limit:"+withdrawalLimit);}
}
class FixedDepositAccount extends BankAccount{
    int tenureMonths;
    FixedDepositAccount(String a,double b,int t){super(a,b);tenureMonths=t;}
    void displayAccountType(){System.out.println("FD "+accountNumber+" Balance:"+balance+" Tenure:"+tenureMonths);}
}
public class BankSystem{
    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount("S001",5000,3.5);
        CheckingAccount c=new CheckingAccount("C001",2000,1000);
        FixedDepositAccount f=new FixedDepositAccount("F001",10000,12);
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}