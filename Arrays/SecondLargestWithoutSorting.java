package Arrays;

//TC: O(N) SC:O(1)
public class SecondLargestWithoutSorting {
    public static int getSecondLargest(int[] arr) {
        int largest=-1, second_largest=-1;
        for(int i:arr){
            if(i>largest){
                second_largest=largest;
                largest=i;
            }
            else if(i!=largest && i>second_largest)   second_largest=i;
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int[] nums={12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(nums));
    }
}
