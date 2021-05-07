package com.yijinjing.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

   class Node{
     private int value;
     private Node left ;
     private Node right;
   }

   public List<Integer>    preorderTraversal(Node  root){
       List<Integer> res = new ArrayList<>(16);
       Stack<Node> stack =new Stack();
       Node node=root;
       while (!stack.isEmpty()|| root != null){

              while (node!=null){
                res.add(node.value);
                stack.push(node);
                node=node.left;
              }
              node = stack.pop();
              node=  node.right;

       }
     return res;
   }
  public List<Integer>    preorderTraversal1(Node  root){
      List<Integer> res = new ArrayList<>();
      Stack<Node> stack = new Stack();
      Node node = root;
      while (node!=null || !stack.empty()){

        while (node!=null){
          res.add(node.value);
          stack.push(node);
          node=  node.left;
        }
        node = stack.pop();
        node=node.right;
      }
   return  res;

  }

}
