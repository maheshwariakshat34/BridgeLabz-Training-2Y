interface Fare{double calculateFare(int km);}
abstract class Ride{
    private String d;
    public Ride(String d1){d=d1;}
    public String getDriver(){return d;}
}
class CarRide extends Ride implements Fare{
    public CarRide(String d){super(d);}
    public double calculateFare(int km){return km*15;}
}
class BikeRide extends Ride implements Fare{
    public BikeRide(String d){super(d);}
    public double calculateFare(int km){return km*7;}
}
public class Q8_RideHailing{
    public static void main(String[] args){
        Fare f1=new CarRide("Alex");Fare f2=new BikeRide("Sam");
        System.out.println("Car Fare "+f1.calculateFare(10));
        System.out.println("Bike Fare "+f2.calculateFare(10));
    }
}