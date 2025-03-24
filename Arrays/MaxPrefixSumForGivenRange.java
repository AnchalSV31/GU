package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxPrefixSumForGivenRange {
    public static List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex, List<Integer> rightIndex) {
        int n = arr.size();                             
        int[] prefixSum = new int[n];

        prefixSum[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr.get(i);
        }
                                
        List<Integer> result = new ArrayList<>();
        for (int k = 0; k < leftIndex.size(); k++) {
            int left = leftIndex.get(k);
            int right = rightIndex.get(k);
            int prefix=0;
            int max=Integer.MIN_VALUE;

            for (int i = left; i <= right; i++) {
                prefix = prefixSum[i] - (left > 0 ? prefixSum[left - 1] : 0);
                max=Math.max(prefix, max);
            }                
            result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(2);
        arr.add(3);
        arr.add(-5);
        List<Integer> leftIndex = new ArrayList<>();
        leftIndex.add(0);
        leftIndex.add(1);
        List<Integer> rightIndex = new ArrayList<>();
        rightIndex.add(3);
        rightIndex.add(3);
        List<Integer> ans= maxPrefixes(arr, leftIndex, rightIndex);
        System.out.println(ans);
        
    }
}
