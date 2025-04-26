package SlidingWindow;

public class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int[] prefixSum= new int[n+1];

        for(int i=1; i<=n; i++){
            prefixSum[i]=prefixSum[i-1]+nums[i-1];
        }

        int minL=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int req=target+prefixSum[i];
            int j=binarySearch(prefixSum, req);
            
            if(j!=-1){
                minL=Math.min(minL, j-i);
            }
        }
        return (minL==Integer.MAX_VALUE) ? 0: minL;
    }

    public static int binarySearch(int[] prefixSum, int target){
        int left=0, right= prefixSum.length-1;
        while(left<right){
            int mid= left+(right-left)/2;
            if(prefixSum[mid]>=target){
                return mid;
            }
            else{
                left=mid+1;
            }

        }
        return (prefixSum[left]>=target) ? left : -1;
    }

    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
