package Arrays;

public class RangeSumQuery {
    public int sumRegion(int[][] nums, int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i=row1; i<=row2; i++){
            for(int j=col1; j<=col2; j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] nums={{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        RangeSumQuery obj = new RangeSumQuery();
        int ans=obj.sumRegion(nums,1,2,2,4);
        System.out.println(ans);
    }
}
