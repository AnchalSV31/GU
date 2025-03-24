package Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int n = nums.length;

        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }

    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
