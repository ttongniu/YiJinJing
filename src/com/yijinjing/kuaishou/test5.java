package com.yijinjing.kuaishou;

import java.util.Objects;

public class test5 {

  public static void main(String[] args) {
    int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    Integer a = null;
    System.out.println(Objects.equals(a,0) );
    
    System.out.println(searchMatrix(matrix, 50));

  }

  /**
   *      从右上角开始 遍历   向左 向下判断
   * @param matrix
   * @param
   * @return
   */
  private static boolean searchMatrix(int[][] matrix, int target) {

   if(matrix==null){
     return  false;
   }
  if(matrix.length==0){
    return  false;
  }
   int rows = matrix.length;
   int cols = matrix[0].length;

    int i=0;
    int j=cols-1;
    while (i<rows && j >=0){
      if(matrix[i][j]==target){
        return true;
      }else if(matrix[i][j]>target){
        --j;
      }else {
        ++i;
      }
    }

    return false;
  }


}
