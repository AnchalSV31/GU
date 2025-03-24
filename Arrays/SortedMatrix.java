package Arrays;

import java.util.Arrays;


//TC: O(N2 LOGN)  SC: O(N2)
public class SortedMatrix {
    public static int[][] sortedMatrix(int n, int Mat[][]) {
        int[] ans= new int[n*n];
        int ind=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                ans[ind++]=Mat[i][j];
            }
            
        }
        Arrays.sort(ans);
        
        ind=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Mat[i][j]=ans[ind++];
            }
        }
        
        return Mat;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] Mat={{10,30,15},{40,60,45},{90,35,65}};
        int[][] ans=sortedMatrix(n,Mat);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
