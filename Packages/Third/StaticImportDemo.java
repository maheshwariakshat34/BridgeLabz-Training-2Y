
// Static Import Demonstration
import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 9.0;
        double b = 4.0;
        double negative = -15.5;

        System.out.println("Using static import from java.lang.Math:");
        System.out.println("Square root of " + a + " = " + sqrt(a));
        System.out.println(a + " raised to the power of " + b + " = " + pow(a, b));
        System.out.println("Maximum of " + a + " and " + b + " = " + max(a, b));
        System.out.println("Minimum of " + a + " and " + b + " = " + min(a, b));
        System.out.println("Absolute value of " + negative + " = " + abs(negative));

        System.out.println("\nWhy use static import?");
        System.out.println("✔ It allows direct access to static methods without class name prefix (e.g., sqrt() instead of Math.sqrt()).");
        System.out.println("⚠ However, avoid excessive use as it may reduce code readability if too many static imports are used.");
    }
}
