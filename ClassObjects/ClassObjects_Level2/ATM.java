import java.util.Scanner;
class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder,String accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount + " deposited successfully.");
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance !");
        }
        else if(amount<=0){
            System.out.println("Invalid withdrawal amount");
        }
        else{
            balance-=amount;
            System.out.println("amount " +  "withdrawn successfully.");
        }

        }
    public void displayDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    } 
public class ATM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    
        BankAccount account = new BankAccount("AKSHAT LAKHOTIYA", "2415500048",150000);
    while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayDetails();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

    


    



