package Arrays;

public class RotateMatrixCounterclockwise {

    //180
    public static int[][] counterClockwise(int[][] matrix){
        int n= matrix.length;
        
        //Reverse every row
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
        
        //Reverse every column
        for(int j=0; j<n; j++){
            for(int i=0; i<n/2; i++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-i-1][j]=temp;
            }
        }
        return matrix;
    }

    //90
    public static int[][] counterClockwise2(int[][] matrix){
        int n= matrix.length;
        
        //Reverse every row
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }

        //Transpose matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix; 
    }
    

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        // int[][] ans= counterClockwise(matrix);
        int[][] ans= counterClockwise2(matrix);


        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
