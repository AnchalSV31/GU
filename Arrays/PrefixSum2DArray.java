package Arrays;

import java.util.Scanner;

public class PrefixSum2DArray {
    public static int[][] Prefix2D(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] sum=new int[n+1][m+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum[i+1][j+1]=sum[i+1][j]+sum[i][j+1]+ matrix[i][j]-sum[i][j];
            }
        }
        return sum;
    }
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

        int[][] ans=Prefix2D(array);
        for(int i=1; i<ans.length; i++){
            for(int j=1; j<ans.length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

