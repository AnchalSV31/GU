package Arrays;

public class RotateImage {
    //rotate 90 by clockwise
    public static int[][] rotate(int[][] matrix){
        int n= matrix.length;
        int m=matrix[0].length;
        //Transpose matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Reverse every row
        for(int i=0; i<n; i++){
            for(int j=0; j<m/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Rotated Matrix:"+ " ");
        rotate(matrix);
    }
}
