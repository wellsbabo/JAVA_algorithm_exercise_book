package Grind75;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int result = maxProfit(new int[]{7,6,4,3,1});
        System.out.println("result = " + result);
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int price : prices){
            if(price < min){
                min = price;
            }else{
                if((price-min) > maxProfit){
                    maxProfit = price - min;
                }
            }
        }
        return maxProfit;
    }

}
