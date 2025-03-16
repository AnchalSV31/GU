package Arrays;

import java.util.Scanner;

public class PrefixSum2DArray {
    public static void main(String[] args) {
        // int[][] arr={{0,3},{2,4}};

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        
       //OR


        Scanner scanner = new Scanner(System.in);
        
        // Get the number of rows and columns for the 2D array
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nThe entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

