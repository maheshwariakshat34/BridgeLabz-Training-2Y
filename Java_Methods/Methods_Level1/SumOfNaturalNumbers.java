import java.util.Scanner;
public class SumOfNaturalNumbers {
    public int calSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumOfNaturalNumbers obj=new SumOfNaturalNumbers();
        
    
        System.out.println(obj.calSum(n));

    }
    
}
