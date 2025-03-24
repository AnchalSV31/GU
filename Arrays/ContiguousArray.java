package Arrays;

import java.util.HashMap;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int sum=0;
        int maxLen=0;
        mpp.put(0,-1);
        for(int i=0;i<n;i++){
           if(nums[i]==0){
            sum+=-1;

           }else{
            sum+=1;
           }
            
            if(mpp.containsKey(sum)){
                maxLen=Math.max(maxLen,i-mpp.get(sum));
            }
            else{
                 mpp.put(sum,i);
            }
        }
        return maxLen;
    } 
 
    public static void main(String[] args) {
        int[] nums={0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}
