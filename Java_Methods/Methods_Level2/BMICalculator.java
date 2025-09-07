import java.util.Scanner;

public class BMICalculator {


    public void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; 
            double heightCm = data[i][1]; 
            double heightM = heightCm / 100; 
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; 
        }
    }

    public String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMICalculator obj = new BMICalculator();

        int teamSize = 10;
        double[][] teamData = new double[teamSize][3]; 

    
        for (int i = 0; i < teamSize; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

    
        obj.calculateBMI(teamData);

        
        String[] statuses = obj.determineBMIStatus(teamData);
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < teamSize; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                i + 1, teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }

        sc.close();
    }
}
