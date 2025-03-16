package Arrays;

public class PrefixSum1DArray {
    public static int prefixSum(int[] arr, int[] target){
        int[] prefix= new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        System.out.print("Prefix Sum Array: ");
        for(int i=0; i<prefix.length; i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        
        if(target[0]==0){
            return prefix[target[target.length-1]];
        }
        else{
            return prefix[target[target.length-1]]-prefix[target[0]-1];
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] target={1,3};

        int ans = prefixSum(arr, target);
        System.out.println(ans);
    }
}
