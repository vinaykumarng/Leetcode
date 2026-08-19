class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int len = prices.length;

        for( int num : prices){
            if(num < buy){
                buy = num;
            }else{
                profit = Math.max(profit, (num-buy));
            }
        }

        return profit;
    }

}