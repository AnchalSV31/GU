package Arrays;

public class LeftShift {
    public static int[] leftShift(int[] arr, int k){
        int n=arr.length;
        int[] temp = new int[n];
        for(int i=0; i<k; i++){
            temp[n-k+i]=arr[i];
        }
        for(int i=k; i<n; i++){
            temp[(i-k)%n]=arr[i];
        }
        return temp;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        int[] ans = leftShift(arr,k);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
