
class BankAccount {
    
    public int accountNumber;       
    protected String accountHolder;
    private double balance;         

    
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    
    public void displaySavingsDetails() {
        System.out.println("Savings Account - Account Number: " + accountNumber + 
                           ", Holder: " + accountHolder +                           
                           ", Interest Rate: " + interestRate + "%");
    }
}


public class BankingSystem{
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount(10101, "Akshat", 5000);
        acc1.displayAccountDetails();

        
        acc1.deposit(2000);
        acc1.withdraw(1500);
        System.out.println("Final Balance (via getter): " + acc1.getBalance());

        SavingsAccount sav1 = new SavingsAccount(20202, "Ravi", 10000, 4.5);
        sav1.displayAccountDetails();
        sav1.displaySavingsDetails();
    }
}
