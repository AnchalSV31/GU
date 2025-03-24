package Arrays;

//Split arrays into two equal sum
public class SplitArray {
    public static boolean splitArray(int[] arr){
        int n=arr.length;
        int[] leftSum= new int[n];
        int[] rightSum=new int[n];
        leftSum[0]=arr[0];
        for(int i=1; i<n; i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        rightSum[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }
        for(int i=0; i<n-1; i++){
            if(leftSum[i]==rightSum[i+1]){
                return true;
            }
        }
        return false;
    }

    //Optimized SC O(1)
    public static boolean splitArray2(int arr[]) {
        int n=arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
    
        for (int i = 0; i < n - 1; i++) {
            leftSum += arr[i]; 
            int rightSum = totalSum - leftSum; 
        
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println(splitArray(arr));
        System.out.println(splitArray2(arr));
    }
}
