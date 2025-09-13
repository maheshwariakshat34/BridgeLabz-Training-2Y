class Vehicle {
    private static double registrationFee = 1000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Reg No: " + registrationNumber +
                               ", Owner: " + ownerName +
                               ", Type: " + vehicleType +
                               ", Fee: " + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: " + registrationFee);
        }
    }
}

public class VehicleSystem{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Akshat", "Car");
        Vehicle v2 = new Vehicle("MH12XY5678", "Ravi", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
