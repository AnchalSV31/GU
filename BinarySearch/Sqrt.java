package BinarySearch;

public class Sqrt {
    //TC: O(log x) SC:O(1)
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int l=0, r= x;
        int ans=-1;

        while(l<=r){
            int mid= l+(r-l)/2;
            if(mid<=x/mid){  // Avoids integer overflow (mid * mid may exceed int range)
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x=8;
        System.out.println(mySqrt(x));
    }
}
