class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int profitmax = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices [l];
                profitmax = Math.max(profit, profitmax);
            } else {
                l=r;
            }
            r++;
        }
        return profitmax;
    }
}
