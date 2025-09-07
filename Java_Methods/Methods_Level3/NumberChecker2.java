import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2 {

    
    public static int countDigits(int n) {
        return Integer.toString(n).length();
    }

    
    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }


    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    
    public static boolean isPalindrome(int n) {
        int[] digits = storeDigits(n);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }


    public static boolean isDuckNumber(int n) {
        int[] digits = storeDigits(n);
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);

        System.out.println("\nNumber of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));
        System.out.println("Palindrome? " + (isPalindrome(number) ? "Yes" : "No"));
        System.out.println("Duck number? " + (isDuckNumber(number) ? "Yes" : "No"));

        sc.close();
    }
}

