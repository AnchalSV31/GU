package Arrays;

public class RangeSumQuery2D {
    private int[][] sum;
    // public NumMatrix(int[][] matrix) {
    //     int n=matrix.length;
    //     int m=matrix[0].length;
    //     sum=new int[n+1][m+1];
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             sum[i+1][j+1]=sum[i+1][j]+sum[i][j+1]+ matrix[i][j]-sum[i][j];
    //         }
    //     }
    // }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(sum==null){
            return 0;
        }
        return sum[row2+1][col2+1]+sum[row1][col1]-sum[row2+1][col1]-sum[row1][col2+1];
    }
}
