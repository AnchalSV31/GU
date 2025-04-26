package BinarySearch;

public class MinInRotatedSortedArray {
    //TC:O(log n) SC: O(1)
    public static int findMin(int[] nums) {
        int n=nums.length;
        int l=0, r=n-1;

        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
        System.out.println(findMin(nums));
    }
}