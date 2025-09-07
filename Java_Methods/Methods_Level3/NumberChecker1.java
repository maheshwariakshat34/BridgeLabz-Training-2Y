import java.util.Scanner;

public class NumberChecker1 {

    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }


    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String numStr = Integer.toString(n);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }
    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("\nChecking number: " + number);
        System.out.println("Prime? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Neon? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Spy? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Automorphic? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Buzz? " + (isBuzz(number) ? "Yes" : "No"));

        sc.close();
    }
}

