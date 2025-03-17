package Arrays;

public class EquilibriumIndex {
        public static int pivotIndex(int[] nums) {
            int sum=0;
            int[] leftSum= new int[nums.length];
            int[] rightSum= new int[nums.length];
            for(int i=0; i<nums.length; i++){
                sum+=nums[i];
                leftSum[i]=sum;
            }
            sum=0;
            for(int i=nums.length-1; i>=0; i--){
                sum+=nums[i];
                rightSum[i]=sum;
            }
            for(int i=0; i<nums.length; i++){
                if(rightSum[i]==leftSum[i]){
                    return i;
                }
            }
            return -1;
        }

        //Optimized Approach [O(n)]
        public static int pivotIndex2(int[] nums) {
            int[] leftSum= new int[nums.length];
            int[] rightSum= new int[nums.length];
            leftSum[0]=nums[0];
            for(int i=1; i<nums.length; i++){
                leftSum[i]=leftSum[i-1]+nums[i];
            }
            rightSum[nums.length-1]=nums[nums.length-1];
            for(int i=nums.length-2; i>=0; i--){
                rightSum[i]=rightSum[i+1]+nums[i];
            }
            for(int i=0; i<nums.length; i++){
                if(rightSum[i]==leftSum[i]){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] nums= {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
        System.out.println(pivotIndex2(nums));

    }
}
