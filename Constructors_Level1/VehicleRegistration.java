class Vehicle{
    private static double registrationFee =5000;


    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public void displayVehicleDetails(){
        System.out.println("Onwer Name : " + ownerName);
        System.out.println("Vehicle Type :  " + vehicleType);
        System.out.println("Registration Fees :" + registrationFee);
    }
    public static void updateRegistrationFees(double newFee){
        registrationFee=newFee;
        System.out.println("Registration Fee updated to: " + registrationFee);
        
        
    }
    }

    



public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Akshat Lakhotiya", "Car");
        Vehicle v2=new Vehicle("Nitin Gupta","Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFees(6000);
        System.out.println("Updated");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

    }
    
}
