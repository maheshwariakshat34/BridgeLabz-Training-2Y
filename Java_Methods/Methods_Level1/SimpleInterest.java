import java.util.Scanner;
class SimpleInterest{
    public static int calInterest(int p,int r,int t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the prinipal: ");
        int p=sc.nextInt();
        System.out.print("enter the rate : ");
        int r=sc.nextInt();
        System.out.print("enter the time :");
        int t=sc.nextInt();
        int SimpleInterest=calInterest(p, r, t);
        System.out.println("Simple interest : "+ SimpleInterest);
    }

}