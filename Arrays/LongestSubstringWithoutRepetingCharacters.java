package Arrays;

public class LongestSubstringWithoutRepetingCharacters {
    public static int longestSubstring(String s){
        if(s.length()==0) return 0;
        int[] arr= new int[256];
        int count=0;
        int j=0; //left pointer
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            arr[c]++;
            while(arr[c]>1){
                arr[s.charAt(j)]--;
                j++;
            }
            count=Math.max(count,i-j+1);
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(longestSubstring(s));
    }
}
