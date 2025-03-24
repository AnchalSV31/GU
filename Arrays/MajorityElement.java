package Arrays;
import java.util.*;

public class MajorityElement {
    //TC:O(N)  SC:O(1)
    public static int majorityElement(int[] arr){
        //element tht appears more than [n/2] times
        int n=arr.length;
        int count=0;
        int ele=0;
        for(int i=0; i<n; i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }else if(ele==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0; i<n; i++){
            if(arr[i]==ele){
                count1++;
            }
        }
        if(count1>n/3){
            return ele;
        }else{
            return -1;
        }
    }

    //TC: O(N)     SC:O(N)
    public static List<Integer> majorityElement2(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> mpp=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        for (int key : mpp.keySet()) {
            if (mpp.get(key) > n / 3) {
                ans.add(key);
            }
        }
        return ans;
    }

    //Boyer-Moore Voting Algorithm
    //TC: O(N) SC: O(1)
    public static List<Integer> majorityElement3(int[] nums) {
        int n=nums.length;
        
        int cnt1=0, cnt2=0;
        int ele1=Integer.MIN_VALUE, ele2=Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(nums[i]==ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
            else if(cnt1==0 && ele2!=nums[i]){
                cnt1=1;
                ele1=nums[i];
            }else if(cnt2==0 && ele1!=nums[i]){
                cnt2=1;
                ele2=nums[i];
            }else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0; cnt2=0;
        for(int num: nums){
            if(num==ele1) cnt1++;
            else if(num==ele2) cnt2++;
        }

        List<Integer> ans= new ArrayList<>();

        if(cnt1>n/3) ans.add(ele1);
        if(cnt2>n/3) ans.add(ele2);

        return ans;

    }

    public static void main(String[] args) {
        // int[] arr={2,2,1,1,1,2,2};
        int[] arr={3,2,3};
        System.out.println(majorityElement3(arr));
    }
}
