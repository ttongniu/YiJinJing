package com.yijinjing.offer;

public class qinwa2 {

  public static   int jump(int n){

    if(n==1){
      return  1;
    }
    if(n==2){
      return 2;
    }

    int[] arr = new int[n+1];

    arr[1] = 1;
    arr[2] = 2;
    for(int i=3;i<arr.length; i++){
      arr[i] = (arr[i-1]+arr[i-2])%1000000007;
    }
    return arr[n];
  }

  public static void main(String[] args) {
    System.out.println(jump(7));
  }

}
