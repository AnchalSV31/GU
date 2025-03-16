package Arrays;

public class MaxProductLessThanK {
    public static int maxProductLessThanK(int[] arr, int k){
        int maxPro=1;
        int curr=1;
        int left=0;
        for(int i=0; i<arr.length; i++){
            curr*=arr[i];
            while(left<=i && curr>=k){
                curr/=arr[left];
                left++;
            }
            if(curr<k){
                maxPro=Math.max(maxPro, curr);
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] arr={10,5,2,6};
        int k=100;
        System.out.println(maxProductLessThanK(arr, k));
    }
}
