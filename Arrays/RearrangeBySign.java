package Arrays;
public class RearrangeBySign {
    public static int[] rearrangeArray(int[] arr) {
                int n = arr.length;
                int[] pos = new int[n / 2 + 1];  
                int[] neg = new int[n / 2 + 1];  
                int posIndex = 0, negIndex = 0;
                
                for (int i = 0; i < n; i++) {
                    if (arr[i] > 0) {
                        pos[posIndex++] = arr[i];
                    } else {
                        neg[negIndex++] = arr[i];
                    }
                }
        
                int index = 0;
                for (int i = 0; i < posIndex; i++) {
                    arr[index++] = pos[i];        
                    arr[index++] = neg[i];        
                }
                return arr;
            }
        public static void main(String[] args) {
            int[] arr={3,2,1,-2,-3,-4};
            int ans[] = rearrangeArray(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
