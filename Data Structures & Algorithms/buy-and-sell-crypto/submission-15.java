class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int l = 0;
        int r = 1;
        if (prices.length>=2)
        {
            int profit = prices[r]-prices[l];
            int maxprofit= profit;

        while(r<prices.length)
        {   profit = prices[r]-prices[l];
            if (profit<0)
            {
                l=r;
                r++;
            }
            else
            {
                r++;
            }
            maxprofit=Math.max(maxprofit, profit);
        }
        if (maxprofit<0)
        {
            return 0;
        }
        else
        {
        return maxprofit;
        }
        }
        else
        {
            return 0 ;
        }
    }
}
