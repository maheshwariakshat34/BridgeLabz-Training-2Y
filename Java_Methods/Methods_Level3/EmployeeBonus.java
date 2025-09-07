import java.util.Random;

public class EmployeeBonus{

    
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; 
        Random rand = new Random();
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; 
            data[i][1] = rand.nextInt(15) + 1;      
        }
        return data;
    }

    
    public static double[][] calculateBonus(int[][] data) {
        double[][] newData = new double[data.length][2]; 
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    
    public static void displayResults(int[][] data, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("EmpID\tOldSalary\tYears\tBonus\tNewSalary");
        

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] bonusData = calculateBonus(employeeData);
        displayResults(employeeData, bonusData);
    }
}
