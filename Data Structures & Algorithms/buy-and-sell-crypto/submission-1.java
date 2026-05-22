class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int max = 0;

        for(int right = 1; right < prices.length; right++){
            int temp = prices[right] - prices[left];
            if (temp > max){
                max = temp;
            }
            if(prices[left] > prices[left + 1]){
                left++;
            }
            if(prices[left] > prices[right]){
                left = right;
            }
        }
        return max;
    }
}
