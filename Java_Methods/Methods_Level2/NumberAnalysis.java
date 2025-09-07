import java.util.Scanner;

public class NumberAnalysis {

    
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");

    
        for (int n : numbers) {
            if (isPositive(n)) {
                System.out.print(n + " is Positive");
                if (isEven(n)) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println(n + " is Negative");
            }
        }

    
        int comparison = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last element: ");
        if (comparison == 1) System.out.println("First element is greater");
        else if (comparison == 0) System.out.println("First and last elements are equal");
        else System.out.println("First element is smaller");

        sc.close();
    }
}

