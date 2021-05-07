package com.yijinjing.offer;

public class LCS {

  public static int getLCS(String s, String t) {
    if (s == null || t == null) {
      return 0;
    }
    int result = 0;
    int sLength = s.length();
    int tLength = t.length();
    int[][] dp = new int[sLength + 1][tLength + 1];
    for (int i = 1; i <= sLength; i++) {
      for (int k = 1; k <= tLength; k++) {
        if (s.charAt(i - 1) == t.charAt(k - 1)) {
          dp[i][k] = dp[i - 1][k - 1] + 1;
          result = Math.max(dp[i][k], result);
        }
      }
    }
    //        for (int i = 1; i <= sLength + 1; i++) {
    //            for (int k = 1; k <= tLength + 1; k++) {
    //                System.out.print(dp[i - 1][k - 1] + " ");
    //            }
    //            System.out.println();
    //        }
    return result;
  }

  public static int getLCS1(String s, String t) {
    if (s == null || t == null) {
      return 0;
    }
    int result = 0;
    int sLength = s.length();
    int tLength = t.length();
    int[][] dp = new int[sLength + 1][tLength + 1];
    for (int i = 1; i <= sLength; i++) {
      for (int k = 1; k <= tLength; k++) {
        if (s.charAt(i - 1) == t.charAt(k - 1)) {
          dp[i][k] = dp[i - 1][k - 1] + 1;
          result = Math.max(dp[i][k], result);
        }
      }
    }
    return result;
  }

  public static int getLCS2(String s, String t) {
    if (s == null || t == null) {
      return 0;
    }
    int result = 0;
    int sLength = s.length();
    int tLength = t.length();
    int[][] dp = new int[sLength + 1][tLength + 1];
    for (int i = 1; i <= sLength; i++) {
      for (int k = 1; k <= tLength; k++) {
        if (s.charAt(i - 1) == t.charAt(k - 1)) {
          dp[i][k] = dp[i - 1][k - 1] + 1;
        }else {
          dp[i][k] = Math.max(dp[i][k-1],dp[i-1][k]);
        }
        result = Math.max(dp[i][k], result);
      }
    }
    return result;
  }
   public static int getLCS3(String s , String t){
      if(s==null || t==null){
        return  0;
      }
      int result = 0;
      int sLen = s.length();
      int tLen = s.length();
      int [][] dp= new int [sLen+1][tLen+1];
      for(int i=1;i<=sLen;i++){
        for(int j=1;j<=tLen;j++){

          if(s.charAt(i-1)== t.charAt(j-1)){
            dp[i][j] =  dp[i-1][j-1]+1;
            result =Math.max(result,dp[i][j]);
          }
        }
      }
       return  result;
   }
  public static int getLCS4(String s , String t){
    if(s==null || t==null){
      return  0;
    }
    int result = 0;
    int sLen = s.length();
    int tLen = s.length();
    int [][] dp= new int [sLen+1][tLen+1];
    for(int i=1;i<=sLen;i++){
      for(int j=1;j<=tLen;j++){

        if(s.charAt(i-1)== t.charAt(j-1)){
          dp[i][j] =  dp[i-1][j-1]+1;
          result =Math.max(result,dp[i][j]);
        }else {
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
          result  = Math.max(dp[i][j],result);
        }
      }
    }
    return  result;
  }


  public static int getLCS4(int[] nums, int n){
    int[] tail = new int[n];
    int res = 0;
    for(int num:nums){
      int l =0 , r=res;

      while (l<r){
        int mid = l+(r-l)/2;
        if(tail[mid]<num){
          l=mid+1;
        }else {
          r=mid;
        }
      }
      tail[l] =num;
      if(r==res){
          res++;
      }
    }

    return  res;
  }


  public static void main(String[] args) {
    System.out.println(getLCS("sahjsdh","sahdsdkj"));
    System.out.println(getLCS2("sahjsdh","sahdsdkj"));
    System.out.println(getLCS3("sahjsdh","sahdsdkj"));
    System.out.println(getLCS4("sahjsdh","sahdsdkj"));
  }

}
