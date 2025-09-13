class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    
    public CarRental() {
        this("Unknown Customer", "Standard Car", 1, 1000); // default cost per day
    }


    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.costPerDay = other.costPerDay;
    }

    
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }


    public void displayRentalDetails() {
        System.out.println("\n--- Car Rental Details ---");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Cost per Day  : " + costPerDay);
        System.out.println("Total Cost    : " + calculateTotalCost());
    }
}

public class CarRentalMain {
    public static void main(String[] args) {
    
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();

    
        CarRental rental2 = new CarRental("Akshat", "Honda City", 5, 1500);
        rental2.displayRentalDetails();

        
        CarRental rental3 = new CarRental(rental2);
        System.out.println("\nCopied Rental Details:");
        rental3.displayRentalDetails();
    }
}
