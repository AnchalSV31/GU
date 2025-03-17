package Arrays;
import java.util.*;

//O(n^2)

public class TripletSum {
    public List<List<Integer>> threeSum(int[] arr, int target){
        int n=arr.length;
        Set<List<Integer>> hs= new HashSet<>();

        for(int i=0; i<n; i++){
            Set<Integer> st = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int third=target-(arr[i]+arr[j]);
                if(st.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    hs.add(temp);
                }
                else{
                    st.add(arr[j]);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(hs);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,4};
        int target=9;
        TripletSum obj = new TripletSum();
        List<List<Integer>> ans=obj.threeSum(arr, target);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
}
