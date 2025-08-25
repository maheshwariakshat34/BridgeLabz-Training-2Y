import java.util.Scanner;

public class FactorialFor {
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

            
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        }

        scanner.close();
    }
}
