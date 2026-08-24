class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minValue = Integer.MAX_VALUE;

        for(int i =0 ; i<prices.length; i++){
             int price = prices[i];

             if(price<minValue){
                minValue = price;
             }
             else if(price -minValue >maxProfit){
                maxProfit=price -minValue;
             }
            
        }
        return maxProfit;
    }
}