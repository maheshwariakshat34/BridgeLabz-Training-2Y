import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;  
    }

    
    public void bookTicket(int seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + "!");
        } else {
            System.out.println("Sorry, this seat is already booked.");
        }
    }

    
    public void displayTicket() {
        if (isBooked) {
            System.out.println("\n--- Ticket Details ---");
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", 250.0);

        while (true) {
            System.out.println("\n--- Movie Ticket Booking ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter seat number to book: ");
                    int seat = sc.nextInt();
                    ticket.bookTicket(seat);
                    break;

                case 2:
                    ticket.displayTicket();
                    break;

                case 3:
                    System.out.println("Thank you for using Movie Booking System!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

