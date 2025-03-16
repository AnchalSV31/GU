package Arrays;

import java.util.*;
//Length of longest subrray of atmost k frequecy
//Sliding Window 2 pointer Approach
public class LongestSubarrayKFreq {
    public static int length(int[] nums, int k){
        int n=nums.length;
        Map<Integer, Integer> freq= new HashMap<>();
        int count=0;
        int l=0; //left pointer
        for(int r=0; r<n; r++){   //Right pointer
            freq.put(nums[r], freq.getOrDefault(nums[r],0)+1);
            while(freq.get(nums[r])>k){
                freq.put(nums[l], freq.get(nums[l])-1);
                l++;
            }
            count=Math.max(count, r-l+1);
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3,1,2};
        int k=2;
        System.out.println(length(nums, k));
    }
}
