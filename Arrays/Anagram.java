package Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
public class Anagram {
    public static boolean isAnagram(String s, String t){
        if(s == null || t == null){
            return false;
        }

        //If anagram is not case sensitve
        // s = s.toLowerCase();
        // t = t.toLowerCase();

        //If case sensitive

        if(s.length() != t.length()){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    //OPTIMIZE APPROACH
    public static boolean isAnagram2(String s, String t){
        if(s==null || t==null){
            return false;
        }
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq = new int[256];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--;
        }

        for(int count: freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }


    //USING HASHMAP
    public static boolean isAnagram3(String a, String b){
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
 
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            }
            else {
                map.put(a.charAt(i), 1);
            }
        }
 
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            }
        }
 
        Set<Character> keys = map.keySet();

        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "lLeHo";
        String t= "HelLo";
        System.out.println(isAnagram3(s,t));
    }
}
