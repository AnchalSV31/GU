package BinarySearch;

public class UpperAndLowerBound {
    //Upper Bound
    public static int upper(int[] nums, int target) {
        int start=0, end= nums.length;

        while(start<end){
            int mid= start+(end-start)/2;
            if (nums[mid] > target) {
                end = mid;  
            } else {
                start = mid + 1;  
            }
        }
        return start;
    }

    //Lower Bound
    public static int lower(int[] nums, int target) {
        int start=0, end= nums.length;

        while(start<end){
            int mid= start+(end-start)/2;
            if (nums[mid] >= target) {
                end = mid;  
            } else {
                start = mid + 1;  
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums={2, 3, 7, 10, 11, 11, 25};
        int target=11;
        System.out.println(upper(nums, target));
        System.out.println(lower(nums, target));
    }
}
