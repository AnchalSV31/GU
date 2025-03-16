package Arrays;

import java.util.Deque;
import java.util.LinkedList;

//using deque
//First negative in every window of size k
//check gfg for solution in arraylist
public class FirstNegative {
    public static int[] firstNegative(int[] arr, int k){
        int n=arr.length;
        int[] result = new int[n - k + 1];   //stores first -ve no. in a window
        
        Deque<Integer> deque = new LinkedList<>(); //Stores index of -ve number
        
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                deque.add(i); 
            }
        }
        
        for (int i = k; i < n; i++) {
            // For each window, check if we have any negative number
            if (!deque.isEmpty()) {
                result[i - k] = arr[deque.peekFirst()];
            } else {
                result[i - k] = 0;
            }
            
            // Remove elements out of this window (i.e., elements whose index is less than i - k + 1)
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            
            if (arr[i] < 0) {
                deque.add(i);
            }
        }
        
        // After processing the array, handle the last window (i.e., i = n - 1)
        if (!deque.isEmpty()) {
            result[n - k] = arr[deque.peekFirst()];
        } else {
            result[n - k] = 0;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int[] ans= firstNegative(arr, k);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
