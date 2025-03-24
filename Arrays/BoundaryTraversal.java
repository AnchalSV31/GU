package Arrays;
import java.util.*;

//TC and SC: O(m+n)
public class BoundaryTraversal {
    public static ArrayList<Integer> boundary(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;

        ArrayList<Integer> ans= new ArrayList<>();

        int top=0, bottom=n-1, left=0, right=m-1;
        for(int i=left; i<=right ;i++){
            ans.add(mat[top][i]);
        }
        top++;

        for(int i=top; i<=bottom; i++){
            ans.add(mat[i][right]);
        }
        right--;
        for(int i=right; i>=left; i--){
            ans.add(mat[bottom][i]);
        }
        bottom--;
        for(int i=bottom; i>=top; i--){
            ans.add(mat[i][left]);
        }
        left++;
        
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> ans= boundary(mat);
        System.out.println(ans);
    }
}
