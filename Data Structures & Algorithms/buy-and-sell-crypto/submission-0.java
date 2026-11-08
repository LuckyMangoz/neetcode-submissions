class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for(int sell : prices) {
            max = Math.max(max, sell - min);
            min = Math.min(min, sell);
        }
        return max;
    }
}
