interface Rentable{double calculateRent(int d);}
abstract class Vehicle{
    private String model;
    public Vehicle(String m){model=m;}
    public String getModel(){return model;}
    public abstract double getBaseRate();
}
class Car extends Vehicle implements Rentable{
    public Car(String m){super(m);}
    public double getBaseRate(){return 1000;}
    public double calculateRent(int d){return d*getBaseRate();}
}
class Bike extends Vehicle implements Rentable{
    public Bike(String m){super(m);}
    public double getBaseRate(){return 300;}
    public double calculateRent(int d){return d*getBaseRate();}
}
public class Q3_VehicleRental{
    public static void main(String[] args){
        Rentable r1=new Car("Sedan");Rentable r2=new Bike("Honda");
        System.out.println("Car Rent "+r1.calculateRent(5));
        System.out.println("Bike Rent "+r2.calculateRent(5));
    }
}