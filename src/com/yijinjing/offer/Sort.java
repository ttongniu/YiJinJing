package com.yijinjing.offer;

import java.util.Arrays;

public class Sort {

  public static void main(String[] args) {
    int[] data  =  new int[]{1,2,4,9,8,6};
    fastFind(data,0,5);
    Arrays.stream(data).forEach(System.out::println);
  }

  public static void fastFind(int[] arr,int l,int r ){

    if(l<r){
       int point  = position(arr,l,r);
      fastFind(arr,l,point-1);
      fastFind(arr,point+1,r);
    }

  }

  private static int position(int[] arr, int l, int r) {
    int key = arr[l];
    while (l<r){

      while (l<r && arr[r]>=key){
            r--;
      }
      arr[l]=arr[r];
      while (l<r && arr[l] <= key){
            l++;
      }
      arr[r] = arr[l];
    }
    arr[r] =key;
    return  r;
  }


}
