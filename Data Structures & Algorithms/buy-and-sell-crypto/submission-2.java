class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for( r = 1; r < prices.length ; r++){
              sum = (prices[r] - prices[l]);
            if( sum < 0){
                 l++;
                 r = l ;
                 continue;
            }
            max = Math.max(max,sum);

        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
