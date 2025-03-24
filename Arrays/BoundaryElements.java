package Arrays;

//TC and SC: O(n)
public class BoundaryElements {
    public static int[] boundaryElements(int[][] matrix)
    {
        // code here
        int n=matrix.length;
        if (n == 1) return new int[]{matrix[0][0]};
        int[] ans=new int[4*n-4];
        int index=0;
        int left=0, right=n-1, top=0, bottom=n-1;
        for (int i = left; i <= right; i++) {
            ans[index++]=matrix[top][i];
        }
        top++;
        while(top<bottom){
            ans[index++]=matrix[top][left];
            ans[index++]=matrix[top][right];
            top++;
        }

        for (int i = left; i <= right; i++) {
            ans[index++]=matrix[bottom][i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[] ans=boundaryElements(matrix);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
