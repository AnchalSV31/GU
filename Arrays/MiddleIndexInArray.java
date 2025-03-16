package Arrays;

public class MiddleIndexInArray {
    public static int findMiddleIndex(int[] arr) {
        int n=arr.length;
        int[] prefixSum= new int[n];
        int[] suffixSum= new int[n];

        prefixSum[0]=arr[0];
        for(int i=1; i<n; i++){
            prefixSum[i]= prefixSum[i-1]+arr[i];
        }

        suffixSum[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffixSum[i]= suffixSum[i+1]+arr[i];
        }

        for(int i=0; i<n; i++){
            if(prefixSum[i]==suffixSum[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-1,8,4};
        System.out.println(findMiddleIndex(arr));
    }
}
