package Arrays;

public class MaxSum {
    //SLIDING WINDOW TECHNIQUE
    public static int maxSum(int[] arr, int k){
        if(k>arr.length){
            return -1;
        }
        int max=0;
        for(int i=0; i<k; i++){
            max+=arr[i];
        }

        int currSum=max;
        for(int i=k; i<arr.length; i++){
            currSum+=arr[i]-arr[i-k];
            max=Math.max(currSum, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,1,-5,1,3,2};
        // int[] arr={};
        int k=3;
        int max=maxSum(arr, k);
        System.out.println(max);    
    }
}
