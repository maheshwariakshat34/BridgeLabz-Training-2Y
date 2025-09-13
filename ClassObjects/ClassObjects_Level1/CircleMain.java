import java.util.Scanner;

class Circle{
    double radius;

   public  Circle(double radius){
    this.radius=radius;
   }
   public double calculateArea(){
    return Math.PI*radius*radius;

   }
   public double calculateCircumference(){
    return 2 * Math.PI * radius;

   }
   public void displayDetails(){
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + calculateArea());
    System.out.println("Circumference: " + calculateCircumference());
    }
   }
   public class CircleMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the cirlce :");
        double radius=sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayDetails();
    }
   }
