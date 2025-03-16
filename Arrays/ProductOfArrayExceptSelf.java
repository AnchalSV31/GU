package Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int[] ans= new int[n];
        int[] prefixSum= new int[n];
        int[] suffixSum= new int[n];

        prefixSum[0]=1;
        for(int i=1; i<n; ++i){
            prefixSum[i]= prefixSum[i-1]*arr[i-1];
        }

        suffixSum[n-1]=1;
        for(int i=n-2; i>=0; --i){
            suffixSum[i]= suffixSum[i+1]*arr[i+1];
        }

        for(int i=0; i<n; i++){
            ans[i]= suffixSum[i]*prefixSum[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int[] ans= productExceptSelf(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
