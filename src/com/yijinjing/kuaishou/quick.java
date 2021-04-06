package com.yijinjing.kuaishou;

import java.util.Arrays;

public class quick {
  public static void main(String[] args) {
    int[] nums = {12,45,62,55,7,9,4};

    quickSort(nums,0,nums.length-1);
    for (int i=0 ;i<nums.length;i++){
      System.out.println(nums[i]);
    }


  }

  private static void quickSort(int[] nums, int low, int high) {
    int pivot=0;

     if(low<high){
          pivot = getPivot(nums,low,high);
          quickSort(nums,low,pivot-1);
          quickSort(nums,pivot+1,high);
     }

  }

  private static int getPivot(int[] nums, int low, int high) {
    int pkey = nums[low];
    while (low<high){
      
      while (low<high&& nums[high]>pkey){
        high--;
      }
      swap(nums,low,high);
      while (low<high&&nums[low]<pkey){
        low++;
      }
      swap(nums,low,high);
    }
    return low;
  }

  private static void swap(int[] nums, int low, int high) {
     int tem = nums[low];
    nums[low]=nums[high];
    nums[high]=tem;
  }

}
