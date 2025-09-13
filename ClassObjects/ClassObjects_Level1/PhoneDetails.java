import java.util.Scanner;
class MobilePhone{
   private String brand;
   private int model;
   private double price;

    public MobilePhone(String brand,int model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("MOBILE BRAND : "+ brand);
        System.out.println("MOBILE MODEL : " + model);
        System.out.println("MOBILE PRICE : " + price);
    }

        
    }
     public class PhoneDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the moible brand : ");
        String b=sc.nextLine();
        System.out.print("enter the model of mobile : ");
        int m=sc.nextInt();
        sc.nextLine();
        System.out.print("enter the price of the phone : ");
        double p=sc.nextDouble();
        MobilePhone phone=new MobilePhone(b, m, p);
        phone.displayDetails();
 }   

}