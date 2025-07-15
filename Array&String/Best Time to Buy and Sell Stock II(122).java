//The Only solution I found using local maxima and local minima , immediate selling of stock if next price is higher than this price OR this price is higher than previous price.
//Refer Anuj kumar Sharma Video
public int maxProfit(int[] prices) {
        int profit =0;
        for(int i =1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
              profit+= prices[i]-prices[i-1];
            }
        }
        return profit;
    }
