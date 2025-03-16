package Arrays;

public class RightShift {
    public static int[] rightShift(int[] arr, int k) {
        int n=arr.length;
        int[] temp = new int[n];
        for(int i=0; i<=k; i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int i=k+1; i<n; i++){
            temp[i-(n-k)]=arr[i];
        }
        return temp;
    }

    //Optimized Approach
    public static int[] rightShift2(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        int[] ans = rightShift2(arr, k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
