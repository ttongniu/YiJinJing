package com.yijinjing.kuaishou;

public class test6 {

  public static void main(String[] args) {
    System.out.println(canCompleteCircuit(new int[] {
      1 , 2 , 3 , 4 , 5
    },new int[] {
      3 , 4 , 5 , 1 , 2
    }));
  }


  public static   int canCompleteCircuit(int[] gas, int[] cost){
      int curSum = 0;
      int totalSum = 0;
      int start =0;
      for(int i =0 ; i < gas.length;i++){
        curSum += gas[i]-cost[i];
        totalSum +=gas[i]-cost[i];
        if(curSum<0){
          curSum=0;
          start=i+1;
        }

      }
      if(totalSum<0){
        return -1;
      }
      return start;
  }

}
