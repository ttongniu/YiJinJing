package com.yijinjing.offer;

public class kaipingfang {

      public static long  kpf(long num){
        long low=0;
        long high = num/2;
        while (low<=high){

          long mid = low +(high-low)/2;
          if(mid*mid>num){
            high=mid-1;
          }else if (mid*mid<num) {
            low=mid+1;
          }else {
            return mid;
          }

        }

        return high;
      }


  public static void main(String[] args) {
    System.out.println(kpf(16));
  }

}
