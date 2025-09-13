class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;


    public HotelBooking() {
        this("Unknown Guest", "Standard", 1); 
    }

    
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }


    public void displayBooking() {
        System.out.println("\n--- Hotel Booking Details ---");
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }
}

public class HotelBookingSystem{
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBooking();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Akshat", "Deluxe", 3);
        booking2.displayBooking();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nCopied Booking:");
        booking3.displayBooking();
    }
}
