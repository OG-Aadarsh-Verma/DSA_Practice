class Solution {
    public int maxProfit(int[] prices) {
        int max_diff = 0, diff = 0;
        int min = prices[0];

        for(int i = 1; i<prices.length; i++){
            diff = prices[i] - min;
            if(diff<0)  min = prices[i];
            else{
                if(max_diff < diff)     max_diff = diff;
            }
        }

        return max_diff;
    }
}
