package Arrays;

public class CountAllSortedRows {
    //count all sorted rows(both increasing and decreasing)
    public static int sortedCount(int N, int M, int Mat[][]) {
        int count=0;
        for(int i=0; i<N; i++){
            if(isIncreasing(Mat[i])|| isDecreasing(Mat[i])){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isIncreasing(int[] Mat){
        for(int j=1; j<Mat.length; j++){
            if(Mat[j]<=Mat[j-1]){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isDecreasing(int[] Mat){
        for(int j=1; j<Mat.length; j++){
            if(Mat[j]>=Mat[j-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat={{1,2,3},{6,5,4},{7,9,8}};
        int n=3,m=3;
        System.out.println(sortedCount(n,m,mat));
    }
}
