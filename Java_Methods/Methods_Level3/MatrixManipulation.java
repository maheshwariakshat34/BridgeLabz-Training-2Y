import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation {

    
    public static int[][] generateRandomMatrix(int rows, int cols, int min, int max) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%5d ", val);
            }
            System.out.println();
        }
    }


    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }


    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible: columns of A != rows of B");
            return null;
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter rows for matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter cols for matrix A / rows for matrix B: ");
        int colsA = sc.nextInt();
        int rowsB = colsA; 
        System.out.print("Enter cols for matrix B: ");
        int colsB = sc.nextInt();

        
        int[][] matrixA = generateRandomMatrix(rowsA, colsA, 1, 10);
        int[][] matrixB = generateRandomMatrix(rowsB, colsB, 1, 10);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

    
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nMatrix A + B:");
            displayMatrix(addMatrices(matrixA, matrixB));

            System.out.println("\nMatrix A - B:");
            displayMatrix(subtractMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nAddition/Subtraction not possible due to dimension mismatch.");
        }

        
        System.out.println("\nMatrix A * B:");
        int[][] product = multiplyMatrices(matrixA, matrixB);
        if (product != null) {
            displayMatrix(product);
        }

        sc.close();
    }
}
