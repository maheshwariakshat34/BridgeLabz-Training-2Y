import java.util.Scanner;

public class RocketLaunchCountdown{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: starting number for countdown
        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        System.out.println("Rocket Launch Countdown:");

        // While loop for countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // decrement counter
        }
        System.out.println("liftoff !!!!!");
    }



    }