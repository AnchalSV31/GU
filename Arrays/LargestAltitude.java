package Arrays;

public class LargestAltitude {
    public static int largestAltitude(int[] gain) {
        int[] prefix= new int[gain.length+1];
        prefix[0]=0;
        prefix[1]= gain[0];
        for(int i=1; i<gain.length; i++){
            prefix[i+1]=gain[i]+prefix[i];
        }

        int result = Integer.MIN_VALUE;
        for (int altitude : prefix) {
            result = Math.max(result, altitude);
        }
       
        return result < 0 ? 0: result;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
}
