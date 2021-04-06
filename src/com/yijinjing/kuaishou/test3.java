package com.yijinjing.kuaishou;

import java.util.Stack;

public class test3<T> {
          private Stack<T> stackA;
          private Stack<T> stackB;

  public test3(Stack<T> stackA, Stack<T> stackB) {
    this.stackA = stackA;
    this.stackB = stackB;
  }

         public  void push1(T value){
             stackA.push(value);
          }
          public T pop() {
            if(stackB.empty()){
              while (!stackA.empty()){
                stackB.push(stackA.pop());
              }
            }
            if(stackB.empty()){
              throw new RuntimeException("error");
            }
            return stackB.pop();
          }

}
