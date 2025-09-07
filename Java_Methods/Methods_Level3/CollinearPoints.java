import java.util.Scanner;

public class CollinearPoints {

    
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of 3 points:");

        System.out.print("x1: "); int x1 = sc.nextInt();
        System.out.print("y1: "); int y1 = sc.nextInt();

        System.out.print("x2: "); int x2 = sc.nextInt();
        System.out.print("y2: "); int y2 = sc.nextInt();

        System.out.print("x3: "); int x3 = sc.nextInt();
        System.out.print("y3: "); int y3 = sc.nextInt();

        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Method: " + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method: " + (collinearArea ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}
