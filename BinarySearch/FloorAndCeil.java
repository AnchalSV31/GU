package BinarySearch;

public class FloorAndCeil {
    //floor= smaller than or equal to x
    //ceil=greater than or equal to x
    public static int floor(int[] nums, int target){
        int start=0, end= nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                ans=nums[mid];
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static int ceil(int[] nums, int target){
        int start=0, end= nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                ans=nums[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums={2, 3, 4, 7, 25};
        int target=5;
        System.out.println("floor: "+ floor(nums, target)+" and ceil: "+ ceil(nums, target));
    }
}
