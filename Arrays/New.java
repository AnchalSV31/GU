package Arrays;
import java.util.*;

public class New {
    public static void main(String[] args){
        // System.out.println("Hello World!");

        // int[] demo = new int[5];
        // for(int i=0; i< demo.length; i++){   //this traversing has complexity of O(n) but to reduce TC we can use Binaray serach for traversig whose TC is O(logn)
        //     demo[i]=i+1;
        //     System.out.print(demo[i]+" ");
        // }

        // int[] demo={1,2,3,4,5,6,4,7};
        // int count=2;
        // int target=4;

        // int ans = targetIndex(demo, count, target);
        // System.out.print(ans);

        // int max=maxEle(demo);
        // System.out.print(max);

        int[] demo={1,2,3,4,5};
        int target=5;

        int pair[] = pairSum(demo, target);
        System.out.print(Arrays.toString(pair));

    }

    public static int targetIndex(int[] demo, int count, int target){
        int curr=0;
        for(int i=0; i< demo.length; i++){
            if(demo[i]==target){
                curr++;
                if(curr==count){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void maxEle(int demo[]){
        int max=Integer.MIN_VALUE;;
        for(int i=0; i< demo.length; i++){
            if(demo[i]>max){
                max=demo[i];
            }
        }
    }

    public static int[] pairSum(int demo[], int target){
        for(int i=0; i<demo.length; i++){
            for(int j=i+1; j<demo.length; j++){
                if(demo[i]+demo[j]==target){
                    return new int[]{demo[i], demo[j]};
                    // System.out.println(demo[i]+","+demo[j]);
                }
            }
        }
        return new int[]{-1, -1};
    }

}
