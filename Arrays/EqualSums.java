package Arrays;

import java.util.ArrayList;



public class EqualSums {

    //TC SC: O(N)
    public static ArrayList<Integer> equalSums(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> ans= new ArrayList<>();
        
        if (n == 1) {  // Edge case: Single element array
            ans.add(-1);
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        
        int[] prefixSum=new int[n];
        prefixSum[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        
        int[] suffixSum=new int[n];
        suffixSum[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffixSum[i]=suffixSum[i+1]+arr[i];
        }
        
        int diff, min=Integer.MAX_VALUE, minIndex=-1;
        int isPrefix=1;  //1 for prefix, 2 for suffix
        for(int i=0; i<n-1; i++){
            diff=Math.abs(prefixSum[i]-suffixSum[i+1]);
            if (diff <= min) {
                min = diff;
                minIndex = i+1;
                isPrefix = (prefixSum[i] < suffixSum[i]) ? 1 : 2; // Identify the array
            }
        }

        if (minIndex == -1) {
            ans.add(-1);
            ans.add(-1);
            ans.add(-1);
        } else {
            ans.add(min);
            ans.add(minIndex + 1);  
            ans.add(isPrefix);
        }
        return ans;
    }

    //OPTIMISED APPROACH SC:O(1)
    public static ArrayList<Integer> equalSums2(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> ans= new ArrayList<>();
        
        if (n == 1) {  // Edge case: Single element array
            ans.add(-1);
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        int totalSum = 0; // Stores the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }
        
        int prefixSum =0, min=Integer.MAX_VALUE, minIndex=-1;
        int isPrefix=0;  //1 for prefix, 2 for suffix
        for(int i=0; i<n-1; i++){
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            int diff=Math.abs(prefixSum-suffixSum);
            if (diff <= min) {
                min = diff;
                minIndex = i+1;
                isPrefix = (prefixSum < suffixSum) ? 1 : 2; // Identify the array
            }
        }

        if (minIndex == -1) {
            ans.add(-1);
            ans.add(-1);
            ans.add(-1);
        } else {
            ans.add(min);
            ans.add(minIndex + 1);  
            ans.add(isPrefix);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 7, 8};
        System.out.println(equalSums2(arr));

    }
}
