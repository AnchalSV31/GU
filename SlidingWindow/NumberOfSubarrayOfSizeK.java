package SlidingWindow;

public class NumberOfSubarrayOfSizeK {
    //TC: O(N) SC: O(1)
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int cnt=0;
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }

        if (sum / k >= threshold) {
            cnt++;
        }

        // Sliding Window: Move from index k to n
        // int i = k;  // Start from k
        // while (i < n){
        for (int i = k; i < n; i++) {
            sum += arr[i]-arr[i-k];      

            if (sum / k >= threshold) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr= {11,13,17,23,29,31,7,5,2,3};
        int k=3;
        int threshold=5;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
}
