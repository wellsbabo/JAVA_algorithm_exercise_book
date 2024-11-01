import Grind75.MergeTwoSortedLists.ListNode;

public class Note {
    public static void main(){

    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                profit = Math.max(profit, prices[i] - min);
            }
        }
        return profit;
    }
}