
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        
        if (num < 0) {
            System.out.println("Sorry, factorial does not exist for negative numbers.");
        } else if (num == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            int factorial = 1;
            int i = 1;

            
            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        }

        scanner.close();
    }
}
