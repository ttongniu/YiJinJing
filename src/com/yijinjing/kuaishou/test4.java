package com.yijinjing.kuaishou;

import java.util.LinkedList;

public class test4<T> {

       LinkedList<T>  queueA = new LinkedList();
       LinkedList<T>  queueB = new LinkedList();

       public    void  push(T value){
         queueA.offer(value);
         while (!queueB.isEmpty()){
           queueA.offer(queueB.pop());
         }
         // 清空a  转换ab
         LinkedList<T>   tem = queueB;
         queueB =queueA;
         queueA = tem;
       }
      public   T pop() {
        return queueB.pop();
      }

  public static void main(String[] args) {
        test4<Integer>  test4 = new test4<Integer>();
        test4.push(1);
        test4.push(2);
        test4.push(3);
    System.out.println("**"+test4.pop());
    System.out.println("**"+test4.pop());
    System.out.println("**"+test4.pop());
  }

}
