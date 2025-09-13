class BankAccount{
    private static String bankName="Akshat Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber; 
    private double balance;


    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber;         
        this.balance = balance;
        totalAccounts++;
    }
    public void displayAccountDetails() {
    
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName +
                               ", Account Holder: " + accountHolderName +
                               ", Account Number: " + accountNumber +
                               ", Balance: " + balance);
        } else {
            System.out.println("Not a valid BankAccount object!");
        }
    }
    public static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}

public class Bank {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Akshat", 10101, 5000);
        BankAccount acc2 = new BankAccount("Ravi", 20202, 10000);


        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        
        BankAccount.getTotalAccounts();
    }
}


    
    
