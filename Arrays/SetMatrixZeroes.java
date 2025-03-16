package Arrays;

public class SetMatrixZeroes {
    public static int[][] setZeroes(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        boolean row[] = new boolean[n]; 
        boolean col[] = new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,0},{0,6,7}};
        int[][] ans= setZeroes(matrix);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
