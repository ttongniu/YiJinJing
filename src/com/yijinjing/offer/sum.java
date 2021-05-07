package com.yijinjing.offer;

public class sum {


   public static   int maxSum(int[]  arr){

     if( arr.length==1){
       return arr[0];
     }
     int res=Integer.MIN_VALUE;
     for(int i=1;i<arr.length;i++){
        arr[i] = arr[i-1]>0? arr[i-1]+arr[i]:arr[i];
        res =  Math.max(res,arr[i]);
     }
  return  res;
   }

  public static void main(String[] args) {
    System.out.println(maxSum(new int[] {1,-2,3,5,-2,6,-1}));
  }


}
