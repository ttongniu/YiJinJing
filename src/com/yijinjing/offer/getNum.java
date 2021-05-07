package com.yijinjing.offer;

public class getNum {

  public static void main(String[] args) {
    System.out.println(getNum.getNumber(new int[]{1,2,3,3,3,3,4},7,3));
  }

  public static int getNumber(int[] data,int length, int k){

    int num= 0;

    if(data!=null && length>0){
      int first = getFirst(data,length,k);
      int last  = getLast(data,length,k);
      if(first>-1 && last>-1){
        return last-first+1;
      }

    }

    return  num;
  }

  private static int getFirst(int[] data, int length, int k) {
    int start = 0;
    int end = length-1;

    while (start<=end){
        int mid =  start + (end - start) /2;
        if(data[mid]>k){
          end=mid-1;
        }else if(data[mid]<k){
          start = mid+1;
        }else {
          if((mid>0 && data[mid-1]!=k) || mid==0 ){
            return mid;
          }else {
            end=mid-1;
          }
        }
    }
    return -1;
  }

  private static int getLast(int[] data, int length, int k) {
    int start = 0;
    int end = length-1;

    while (start<=end){
      int mid =  start + (end - start) /2;
      if(data[mid]>k){
        end=mid-1;
      }else if(data[mid]<k){
        start = mid+1;
      }else {
        if((mid<length-1 && data[mid+1]!=k) || mid==length-1 ){
          return mid;
        }else {
          start=mid+1;
        }
      }
    }
    return -1;
  }


}
