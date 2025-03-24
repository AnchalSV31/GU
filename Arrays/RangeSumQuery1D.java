package Arrays;

public class RangeSumQuery1D {
    private int[] sum;
    public static void NumArray(int[] nums) {
        int n=nums.length;
        int[] sum=new int[n];
        sum[0]=nums[0];
        for(int i=1; i<n; i++){
            sum[i]=sum[i-1]+ nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(sum == null || left < 0 || right >= sum.length) return 0;
        return left== 0 ? sum[right]: sum[right]-sum[left-1];
    }
}
