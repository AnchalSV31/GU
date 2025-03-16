package Arrays;

public class SpiralMatrix {
    public static void spiral(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int top=0; int left=0; int right=m-1; int bottom=n-1;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]);
            }
            right--;
            for(int i=right; i>=left; i--){
                System.out.print(arr[bottom][i]);
            }
            bottom--;
            for(int i=bottom; i>=top; i--){
                System.out.print(arr[i][left]);
            }
            left++;
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3}, {4,5,6}, {7,8,9}};
        spiral(matrix);
    }
}
