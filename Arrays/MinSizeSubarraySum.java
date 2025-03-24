package Arrays;

public class MinSizeSubarraySum {
    //Brute Force
    //TC: O(N2)
    public static int minSize(int[] nums, int target) {
        int n=nums.length;
        int minL=Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            int sum = nums[i];
            if (sum >= target) return 1;
            
            for (int j = i + 1; j < n; j++) { 
                sum += nums[j];
                
                if (sum >= target) { 
                    minL = Math.min(j - i + 1, minL);
                }
            }
        }
        return (minL == Integer.MAX_VALUE) ? 0 : minL;
    }

    //Better APPROACH  [SLIDING WINDOW]
    //TC: O(N)  SC: O(1)
    public static int minSize2(int[] nums, int target) {
        int n=nums.length;
        int minL=Integer.MAX_VALUE;
        int left=0, sum=0;

        for(int i=0; i<n; i++){
            sum+=nums[i];
            while(sum>=target){
                minL=Math.min(minL, i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (minL == Integer.MAX_VALUE) ? 0 : minL;
    }
    
    //OPTIMISED APPROACH  [USING PREFIX SUM AND BINARY SERACH]
    //TC: O(NlogN)  SC: O(N)
    public static int minSize3(int[] nums, int target) {
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
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSize3(nums, target));
    }
}
