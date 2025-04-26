package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int l=0, r=0;
        int n= s.length();

        if(n==0){
            return 0;
        }

        int maxL = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();

        while(r<n){
            if(set.contains(s.charAt(r))){
            // maxL= Math.max(maxL, r-l+1);

                while(l<r && set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxL= Math.max(maxL, r-l+1);
            r++;
        }
        return maxL;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
