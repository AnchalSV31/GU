package Arrays;
//TC: O(n)
public class Palindrome {
    public boolean isPalindrome(String s){
        int l=0; int r= s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalindrome2(int x){
        if(x<0){
            return false;
        }
        int rev=0; int orig=x;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev==orig;
    }

    public static void main(String[] args) {
        String s="malayalam";
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(s));

        int n=12321;
        System.out.println(obj.isPalindrome2(n));
    }
}
