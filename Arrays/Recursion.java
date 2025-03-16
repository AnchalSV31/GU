package Arrays;
import java.util.*;
public class Recursion {
    public static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        reverse(n-1);
    }

    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int digitSum(int num){
        int sum=0;
        if(num==0){
            return 0;
        }
        if(num<10){
            return num;
        }
        sum=num%10+digitSum(num/10);
        return sum;
    }

    public static  ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> arr, int index, ArrayList<Integer> curr) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        // ArrayList<Integer> curr= new ArrayList<>();
        if(index==arr.size()){
            res.add(new ArrayList<>(curr));
            return res;
        }
        res.addAll(subset(arr, index+1, curr));
        curr.add(arr.get(index));
        res.addAll(subset(arr,index+1, curr));
        curr.remove(curr.size()-1);
        return res;
    }
    public static void main(String[] args) {
        // int n=5;
        // int num=123;
        // System.out.print(reverse(n));;
        // reverse(n);
        // System.out.println();
        // System.out.println(fact(n));
        // System.out.println(digitSum(num));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ArrayList<ArrayList<Integer>> ans= subset(arr, 0 , new ArrayList<>());
        System.out.println(ans);
    }
}
