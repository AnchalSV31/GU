package Arrays;

public class RainwaterTrapping {
    public static int trap(int[] arr){
        int[] prefixSum = prefix(arr);
        int[] suffixSum = suffix(arr);
        int trap=0;
        for(int i=0; i<arr.length; i++){
            int min= Math.min(prefixSum[i], suffixSum[i]);
            if(min>arr[i]){
                trap+=min-arr[i];
            }
        }
        return trap;
    }

    public static int[] prefix(int[] arr){
        int[] prefix= new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = Math.max(prefix[i - 1], arr[i]);
        }
        return prefix;
    }

    public static int[] suffix(int[] arr){
        int[] suffix= new int[arr.length];
        suffix[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            suffix[i] = Math.max(suffix[i + 1], arr[i]);
        }
        return suffix;
    }

    public static void main(String[] args) {
        int[] arr={3,0,1,0,4,0,2};
        System.out.println(trap(arr));
    }
}
