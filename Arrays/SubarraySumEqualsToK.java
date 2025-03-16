package Arrays;

public class SubarraySumEqualsToK {
    public static int subarraySum(int[] nums, int k){
        int count=0;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[i];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        int ans = subarraySum(nums, k);
        System.out.println(ans);
    }
}
