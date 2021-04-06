package com.yijinjing.offer;

public class SearchTwo {

// 查找第一个值等于给定值的元素
  public static int search(int[] nums,int val ){
    int n= nums.length;
    int low=0,high=n-1;

    while (low<=high){
      int mid = low +(high - low)/2;
      if(nums[mid] >val ){
        high=mid-1;
      }else if (nums[mid] < val) {
        low=mid+1;
      }else {
        if(mid==0 || nums[mid-1]!=val){
          return mid;
        }
        high=mid-1;
      }
    }
     return -1;
  }
//查找最后一个值等于给定值的元素
public static int search2(int[] nums,  int val){
  int n= nums.length;
  int low=0,high=n-1;

  while (low<=high){
    int mid = low +(high - low)/2;
    if(nums[mid] >val ){
      high=mid-1;
    }else if (nums[mid] < val) {
      low=mid+1;
    }else {
      if(mid==n-1 || nums[mid+1]!=val){
        return mid;
      }
      low=mid+1;
    }
  }
  return -1;
}
//查找第一个大于等于给定值的元素
  public static int search3(int[] nums,int val ){
    int n= nums.length;
    int low=0,high=n-1;

    while (low<=high){
      int mid = low +(high - low)/2;
       if (nums[mid] < val) {
        low=mid+1;
      }else {
        if(mid==0 || nums[mid-1]!=val){
          return mid;
        }
        high=mid-1;
      }
    }
    return -1;
  }
  //查找最后一个值等于给定值的元素
  public static int search4(int[] nums,  int val){
    int n= nums.length;
    int low=0,high=n-1;

    while (low<=high){
      int mid = low +(high - low)/2;
      if(nums[mid] >val ){
        high=mid-1;
      }else {
        if(mid==n-1 || nums[mid+1]!=val){
          return mid;
        }
        low=mid+1;
      }
    }
    return -1;
  }
}
