package SlidingWindow;

public class NumberOfAlternatingGroups {
    public static int numberOfAlternatingGroups(int[] arr) {
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int left=arr[i];
            int mid=arr[(i+1)%n];
            int right=arr[(i+2)%n];;

            if(left!=mid && left==right){
                cnt++;
            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        int[] arr= {0,1,0,0,1};
        System.out.println(numberOfAlternatingGroups(arr));
    }
}
