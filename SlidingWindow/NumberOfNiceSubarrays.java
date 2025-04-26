package SlidingWindow;

public class NumberOfNiceSubarrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int cnt=0, ans=0;
        int l=0; int r=0;
        while(r<n){
            if(cnt==k){
                ans++;
            }
            else if(cnt>k){
                cnt=0;
                l++;
                r++;
            }
            else{
                if(nums[r]%2!=0){
                    cnt++;
                    r++;
                }else{
                    l++;
                    r++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,1,1};
        int k=3;
        System.out.println(numberOfSubarrays(nums, k));
    }
}
