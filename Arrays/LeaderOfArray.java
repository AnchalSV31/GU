package Arrays;
//An element is a leader if it is greater than all the elements to its right side
public class LeaderOfArray {
    public static int[] leader(int arr[]){
        int n= arr.length;
        int[] ans = new int[n];

        int count=0;
        int leader = arr[n-1];
        ans[count++]=leader;

        for(int i=n-2; i>=0; i--){
            if(arr[i]>leader){
                leader = arr[i];
                ans[count++]=leader;
            }
        }

        int res[] = new int[count];
        for(int i=0; i<count; i++){
            res[i]=ans[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr= {16,17,4,3,5,2};
        int[] result=leader(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
