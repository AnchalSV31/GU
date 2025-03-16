package Arrays;

public class MaxProduct {
    public static int maxProduct(int[] arr, int k){
        int n=arr.length;
        if(n<k){
            return -1;
        }
        int max=1;
        for(int i=0; i<k; i++){
            max*=arr[i];
        }

        int currPro=max;
        for(int i=k; i<n; i++){
            currPro=arr[i]*(currPro/arr[i-k]);
            max=Math.max(currPro, max);
        }
        return max;
    }


    public static void minProd(int[] arr, int max, int k){
        int n=arr.length;
        if(n<k){
            return;
        }
        int curr=1;
        for(int i=0; i<k; i++){
            curr*=arr[i];
        }
        if(curr<max){
            System.out.println(0+" , "+(k-1));
        }
        
        for(int i=k; i<n; i++){
            curr=arr[i]*(curr/arr[i-k]);
            if(curr<max){
                System.out.println((k-i+1)+" , "+ i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,2,1,10,12};
        int k=2;
        int max=10;
        int ans = maxProduct(arr,k);
        System.out.println(ans);

        //subarray with prod less than max
        minProd(arr, max, k);
    }
}
