//This is the only approach I got , usually the optimized one , 
//Here we are either updating the minimum price value or else we are calculating the profit.
public int maxProfit(int[] prices) {
       int min = Integer.MAX_VALUE;
       int profit =0;
       for(int i =0; i<prices.length; i++){
        if(prices[i]<min){
            min = prices[i];
        }
        else{
            int a = prices[i]-min;    //Here we can also directly use profit = Math.max(profit, prices[i] - min);
            if(a>profit){
                profit = a;
            }
        }
      
       }
         return profit;
    }
