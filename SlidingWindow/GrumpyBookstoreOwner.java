package SlidingWindow;

public class GrumpyBookstoreOwner {
    //TC: O(N) SC: O(1)
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int c=customers.length;
        int l=0;
        int maxWindow=0;
        int window=0, satisfied=0;

        for(int r=0; r<c; r++){
            if(grumpy[r]==1){
                window+=customers[r];
            }else{
                satisfied+=customers[r];
            }
            if(r-l+1>minutes){
                if(grumpy[l]==1){
                    window-=customers[l];
                }
                l++;
            }
            maxWindow=Math.max(window, maxWindow);
        }
        return satisfied+maxWindow;
    }

    public static void main(String[] args) {
        int[] customers={1,0,1,2,1,1,7,5};
        int[] grumpy={0,1,0,1,0,1,0,1};
        int minutes=3;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
}
