package Arrays;

public class ReverseArray {
    public static int[] reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int start=2;
        int end=4;
        int[] ans = reverse(nums, start, end);
        for(int i=0; i<ans.length; i++){    
            System.out.print(ans[i]+" ");
        }
    }
}
