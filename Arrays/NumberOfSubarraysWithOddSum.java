package Arrays;

public class NumberOfSubarraysWithOddSum {
    //TC: O(N)  SC: O(1)
    public static int subarrayWithOddSum(int[] arr) {
        int MOD = 1000000007;
        int count = 0;
        int oddCount = 0, evenCount = 1;  // evenCount starts at 1 to handle case when the prefix sum is directly odd
        int prefixSum = 0;
        
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 == 0) {
                // if prefix sum is even, increment evenCount
                count = (count+oddCount)%MOD;
                evenCount++;
            } else {
                // if prefix sum is odd, increment oddCount
                count = (count+evenCount)%MOD;
                oddCount++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums ={1,3,5};
        int ans=subarrayWithOddSum(nums);
        System.out.println(ans);
    }
}
