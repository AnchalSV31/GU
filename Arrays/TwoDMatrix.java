package Arrays;

public class TwoDMatrix {
    public static void printMatrix(int[][] arr){
        int n=arr.length;
        int m= arr[0].length;
        System.out.print("Top Row : ");
        for(int j=0; j<m; j++){
            System.out.print(arr[0][j]+" ");
        }
        System.out.println();

        System.out.print("First Column : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i][0]+ " ");
        }
        System.out.println();

        System.out.print("Bottom row : ");
        for(int j=0; j<m; j++){
            int i=n-1;
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();

        System.out.print("Last Column : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i][m-1]+" ");
        }
    }

    public static void printDiagonal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static int[][] printTranspose(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }

    public static int[][] reverse(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3}, {4,5,6}, {7,8,9}};
        // printMatrix(matrix);
        
        // printDiagonal(matrix);

        // int[][] ans= printTranspose(matrix);
        // for(int i=0; i<ans.length; i++){
        //     for(int j=0; j<ans[0].length; j++){
        //         System.out.print(ans[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int[][] ans2= reverse(matrix);
        for(int i=0; i<ans2.length; i++){
            for(int j=0; j<ans2[0].length; j++){
                System.out.print(ans2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
