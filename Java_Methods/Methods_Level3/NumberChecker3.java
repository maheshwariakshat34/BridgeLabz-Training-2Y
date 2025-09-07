import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    // Method to count digits in a number
    public static int countDigits(int n) {
        return Integer.toString(n).length();
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        int[] digits = storeDigits(n);
        for (int d : digits) sum += d;
        return sum;
    }
    public static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        int[] digits = storeDigits(n);
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    
    public static boolean isHarshad(int n) {
        int sumDigits = sumOfDigits(n);
        if (sumDigits == 0) return false; 
        return n % sumDigits == 0;
    }


    public static int[][] digitFrequency(int n) {
        int[] digits = storeDigits(n);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i; 

        for (int d : digits) freq[d][1]++; 

        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);
        System.out.println("\nNumber of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Harshad number? " + (isHarshad(number) ? "Yes" : "No"));

        System.out.println("\nDigit frequencies:");
        int[][] freq = digitFrequency(number);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " : " + freq[i][1]);
            }
        }

        sc.close();
    }
}
