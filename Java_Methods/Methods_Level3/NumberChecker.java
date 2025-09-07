import java.util.Scanner;

public class NumberChecker {

    
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    
    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    
    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    
    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("\nChecking for number: " + number);

        System.out.println("Perfect Number? " + (isPerfect(number) ? "Yes" : "No"));
        System.out.println("Abundant Number? " + (isAbundant(number) ? "Yes" : "No"));
        System.out.println("Deficient Number? " + (isDeficient(number) ? "Yes" : "No"));
        System.out.println("Strong Number? " + (isStrong(number) ? "Yes" : "No"));

        sc.close();
    }
}

