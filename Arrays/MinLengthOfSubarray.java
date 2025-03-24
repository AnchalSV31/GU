package Arrays;

import java.util.ArrayList;

//Min length of subarray whose sum is positive
public class MinLengthOfSubarray {
    public static ArrayList<Integer> minLength(int[] A){
        int n=A.length;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(A[i]>0){
                ans.add(1);
            }
            else{
                int sum=A[i];
                boolean found=false;
                for(int j=i+1; j<n; j++){
                    sum+=A[j];
                    if(sum>0){
                        ans.add(j-i+1);
                        found=true;
                        break;
                    }
                }
                if(!found){
                    ans.add(0);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={-4,3,4};
        System.out.println(minLength(arr));
    }
}
