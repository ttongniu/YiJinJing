package com.yijinjing;

import java.util.ArrayList;
import java.util.List;

import static com.yijinjing.arraySwapUtil.swap;

public class bubbleSort {


  public static void main(String[] args) {
   // int[] arr = new int[] {2,3,5,4,5};
   //  bubble(arr);
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.get(2);
  }

  public static void  bubble(int[] arrs){
    //0-n
    //o-n-1
    for(int i=arrs.length-1;i>0;i--){

      for(int j=0;j<i;j++){
        if(arrs[j] >arrs[j+1]){
          swap(arrs,j,j+1);
        }
      }
    }
  }




}
