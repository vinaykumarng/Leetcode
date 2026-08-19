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

        // brute force approcah
        // int minInd = 0;
        // int minEle = Integer.MAX_VALUE;
        // for(int i = 0 ; i < len ; i++ ){
        //     if( prices[i] < minEle){
        //         minEle = prices[i];
        //         minInd = i;
        //     }
        // }
        // int maxInd = 0;
        // int maxEle = 0;

        // for(int i = minInd ; i < len ; i++){
        //     if(prices[i] > maxEle){
        //         maxEle = prices[i];
        //         maxInd = i;
        //     }
        // }

        // return prices[maxInd] - prices[minInd];
    }

}