import java.util.Scanner;
public class RunningRound {
    public static int countRounds(int d,int a,int b,int c){
        int p=a+b+c;
        int round=d/p;
        return round;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the distance to covered : ");
        int  d=sc.nextInt();
        System.out.print("Sides of triangle : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int calRound=countRounds(d, a, b, c);
        System.out.println("rounds : "+ calRound );


    }
    
}
