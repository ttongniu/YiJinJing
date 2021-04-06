package com.yijinjing;

public class binarySearch {
  
  
  public static int  binarySearch(int[] arr,int target){
     int left = 0;
     int right = arr.length-1;
     while (left<=right){
       int mid = left + (right-left)/2;
       if(arr[mid]==target){
         return mid;
       }else if (arr[mid]<target){
         left=mid+1;
       }else if(arr[mid]>target){
        right = mid-1;
       }
     }
     return -1;
  }


  public static int  binarySearchLeft(int[] arr,int target){
    int left = 0;
    int right = arr.length-1;
    while (left<=right){
      int mid = left + (right-left)/2;
      if(arr[mid]==target){
        left =mid+1;
      }else if (arr[mid]<target){
        left=mid+1;
      }else if(arr[mid]>target){
        right = mid-1;
      }
    }
    if(arr[left]!=target){
       return -1;
    }

    return left;
  }


  public static int  binarySearchRight(int[] arr,int target){
    int left = 0;
    int right = arr.length-1;
    while (left<=right){
      int mid = left + (right-left)/2;
      if(arr[mid]==target){
        right = right-1;
      }else if (arr[mid]<target){
        left=mid+1;
      }else if(arr[mid]>target){
        right = mid-1;
      }
    }
    if(arr[right]!=target){
      return -1;
    }
    return right;
  }

  public static void main(String[] args) {
    System.out.println(binarySearch(new int[] {0, 1, 2, 3, 5, 7, 8, 9},9));
  }


}
