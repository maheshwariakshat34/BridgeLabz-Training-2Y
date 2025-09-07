import java.util.Scanner;
public class HandShakes {
    public int possibleHandshakes(int n){
        return  (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HandShakes obj=new HandShakes();
        int possible=obj.possibleHandshakes(n);
        System.out.println(possible);
    }
    
}
