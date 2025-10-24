package Leetcode;

import java.util.stream.IntStream;

public class BestTimeToBuyAndSellStock {


    public int maxProfit(int [] prices)
    {
        int maxProfit=0;
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++)
        {
           int currentPrice= prices[i];
            if(minPrice>prices[i])
            {
                minPrice=prices[i];
            }
            if((prices[i]-minPrice)> maxProfit)
            {
                maxProfit=prices[i]-minPrice;
            }
            System.out.println(maxProfit+"         "+minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] array={7,1,5,3,6,4};
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock=new BestTimeToBuyAndSellStock();
        int result=bestTimeToBuyAndSellStock.maxProfit(array);
        System.out.println("result "+result);
    }
}
