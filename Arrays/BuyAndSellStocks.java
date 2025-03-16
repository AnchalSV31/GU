package Arrays;

public class BuyAndSellStocks {
    public static int stocks(int[] arr){
        int n=arr.length;
        int maxP=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            minPrice=Math.min(arr[i], minPrice);
            maxP=Math.max(maxP, arr[i]-minPrice);
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(stocks(prices));
    }
}
