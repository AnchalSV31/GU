package Arrays;

public class NumberOfSubarraysWithOddSum {
    public static int subarrayWithOddSum(int[] arr) {
        int count = 0;
        int oddCount = 0, evenCount = 1;  // evenCount starts at 1 to handle case when the prefix sum is directly odd
        int prefixSum = 0;
        
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 == 0) {
                // if prefix sum is even, increment evenCount
                count += oddCount;
                evenCount++;
            } else {
                // if prefix sum is odd, increment oddCount
                count += evenCount;
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
