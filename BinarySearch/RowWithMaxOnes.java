package BinarySearch;

public class RowWithMaxOnes {
    //TC: O(N*M)  SC:O(1)
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        // int m=mat[0].length;
        int maxCount= Integer.MIN_VALUE;
        int rowIndex=0;

        for(int i=0; i<n; i++){
            int count=0;
            // for(int j=0; j<m; j++){
            //     if(mat[i][j]==1){
            //         count++;
            //     }
            // }
            for (int num : mat[i]) {
                count += num; // Since it's a binary matrix, just summing gives the count of 1's
            }
            if (count > maxCount) {
                maxCount = count;
                rowIndex = i; // Update row index
            }
        }
        return new int[]{rowIndex, maxCount};
    }

    public static void main(String[] args) {
        int[][] mat={{0,0},{1,1},{0,0}};
        int[] result = rowAndMaximumOnes(mat);
        System.out.println("Row Index: " + result[0]);
        System.out.println("Maximum Ones Count: " + result[1]);

    }
}
