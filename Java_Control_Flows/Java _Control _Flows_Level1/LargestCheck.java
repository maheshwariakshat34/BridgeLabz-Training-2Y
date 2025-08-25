import java.util.Scanner;
public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("enter the second number ");
        int num2 = sc.nextInt();
        System.out.println("enter the third number ");
        int num3 = sc.nextInt();


        if(num1>num2 && num1>num3){
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }
        if(num2>num1 && num2>num3){
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }
        if(num3>num1 && num3>num2){
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }


    }
}
