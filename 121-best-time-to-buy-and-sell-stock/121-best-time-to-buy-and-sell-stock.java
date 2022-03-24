class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int max=0;
        int min=prices[0];
        
        for(int stockprice:prices){
             min=Math.min(min,stockprice);
             profit=stockprice-min;
             max=Math.max(max,profit);
        }
    
                     return max; 
    }
    
}