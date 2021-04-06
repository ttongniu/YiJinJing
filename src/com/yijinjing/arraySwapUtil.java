package com.yijinjing;

public class arraySwapUtil {
  public static void  swap(int[] arr ,int i ,int j){
    int tem = arr[i];
    arr[i] = arr[j];
    arr[j] = tem;
  }
}
