package BinarySearch;

public class SingleElementInSortedArray {
    //TC: O(logn) SC: O(1)
    public static int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        int l=0, r=n-1;

        while(l<r){
            int mid=l+(r-l)/2;
            if(mid%2==1){
                mid--;  //ensure mid is even
            }
            if(nums[mid]!=nums[mid+1]){
                r=mid;
            }
            else{
                l=mid+2;
            }
        }
        return nums[l];
        
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
