package Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missingNumber(nums);
        System.out.print(ans);
    }
}
