import java.util.Scanner;

public class NumberCheck {

    public int checkNumber(int num) {
        if (num > 0) {
            return 1;  
        } else if (num < 0) {
            return -1; 
        } else {
            return 0;  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        NumberCheck obj = new NumberCheck();

        // Call method
        int result = obj.checkNumber(n);

    
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

    
    }
}
