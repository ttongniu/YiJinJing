package com.yijinjing.kuaishou;

public class test7 {

  public int maxProfit(int[] prices){
    if(prices==null){
      return 0;
    }
    if(prices.length==0){
      return 0;
    }
    int min = prices[0];
    int max = 0;

    for (int price : prices) {
      if (min > price) {
        min = price;
      } else {
        max = Math.max(max, price - min);
      }
    }
    return  max;
  }

  public int maxProfit1(int[] prices){
    if(prices==null){
      return 0;
    }
    if(prices.length==0){
      return 0;
    }
     int max =0;

    for(int i=1;i<prices.length;i++){
      if(prices[i]>prices[i-1]){
        max+= prices[i]-prices[i-1];
      }
    }
    return max ;
  }

}
