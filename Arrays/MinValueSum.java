package Arrays;

public class MinValueSum {
    public static int minStartValue(int[] nums) {
        int currSum=0;
        int minSum=0;

        for(int num: nums){
            currSum+=num;
            minSum=Math.min(minSum, currSum);
        }
        if(minSum<=0){
            return 1-minSum;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int[] nums={-3,2,-3,4,2};
        int result=minStartValue(nums);
        System.out.println("Minimum start value: "+result);
    }
}