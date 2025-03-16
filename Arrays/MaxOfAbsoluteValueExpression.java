package Arrays;

public class MaxOfAbsoluteValueExpression {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max=0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                int currentValue = Math.abs(arr1[i] - arr1[j]) + Math.abs(arr2[i] - arr2[j]) + Math.abs(i - j);
                max = Math.max(max, currentValue);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={-1,4,5,6};
        MaxOfAbsoluteValueExpression obj = new MaxOfAbsoluteValueExpression();
        int ans = obj.maxAbsValExpr(arr1, arr2);
        System.out.print(ans);
    }
}
