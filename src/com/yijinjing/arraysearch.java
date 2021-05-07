package com.yijinjing;

public class arraysearch {

  public static int arraysearch(int[] array ,int target){
    int left =0;
    int right = array.length-1;
    int mid=0;
    while( left <= right )
    {
      mid = (left + right) / 2;
      //在左半支
      if(target > array[left])
      {
        //mid的位置在右半支
        if(array[mid] < array[left])
          right = mid;
          //mid在左半支
        else
        {
          if(target > array[mid])
            left = mid + 1;
          else if(target < array[mid])
            right = mid - 1;
          else
            return mid;
        }
      }
      //在右半支
      else if(target < array[left])
      {
        //mid切分在左半支
        if(array[mid] > array[right])
          left = mid;
          //mid切分在右半支
        else
        {
          if(target > array[mid])
            left = mid + 1;
          else if(target < array[mid])
            right = mid - 1;
          else
            return mid;
        }
      }
      else
        return left;
    }


    return -1;
  }

  public static void main(String[] args) {
    int[] arr ={5,6,7,8,1,2,3,4};

    System.out.println( arraysearch(arr,2));
  }

}
