interface Refuelable{void refuel();}
class VehicleH{
    String model;
    int maxSpeed;
    VehicleH(String m,int s){model=m;maxSpeed=s;}
}
class ElectricVehicle extends VehicleH{
    ElectricVehicle(String m,int s){super(m,s);}
    void charge(){System.out.println("Charging "+model);}
}
class PetrolVehicle extends VehicleH implements Refuelable{
    PetrolVehicle(String m,int s){super(m,s);}
    public void refuel(){System.out.println("Refueling "+model);}
}
public class HybridVehicleSystem{
    public static void main(String[] args){
        ElectricVehicle e = new ElectricVehicle("EV-X",180);
        PetrolVehicle p = new PetrolVehicle("PV-Y",160);
        e.charge();
        p.refuel();
    }
}