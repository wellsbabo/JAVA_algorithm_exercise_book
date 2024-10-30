package Grind75;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        maxProfit(new int[]{1,0,0});
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        
        for(int i=0; i<prices.length-1; i++){
            for(int j=i; j<prices.length; j++){
                if(prices[j] <= prices[i]){
                    continue;
                }
                int tmp = prices[j] - prices[i];
                if(tmp > result){
                    result = tmp;
                }
            }
        }
        System.out.println("result = " + result);
        return result;
    }
}
