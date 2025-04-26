package SlidingWindow;

public class MaxConsecutiveOnes3 {
    //TC:O(N) SC: O(1)
    public static int maxConsecutiveOnes3(int[] nums, int k) {
        int n= nums.length;
        int l=0, r=0;
        int countZeros=0, maxOnes=0;

        while(r<n){
            if(nums[r]==0){
                countZeros++;
            }
            while(countZeros>k){
                if(nums[l]==0) countZeros--;
                l++;
            }
            maxOnes=Math.max(maxOnes, r-l+1);
            r++;
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] nums ={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(maxConsecutiveOnes3(nums, k));
    }
}
