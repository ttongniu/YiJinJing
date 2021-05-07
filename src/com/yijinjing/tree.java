package com.yijinjing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class tree {

      class Node {
        private  Node left;
        private Node right;
        private  int value;
      }

      public List<List<Integer>> treeList(Node root){
        List<List<Integer>> res =new ArrayList<>();
        LinkedList<Node>  list = new LinkedList();
        list.offer(root);
        while (!list.isEmpty()){
               int size = list.size();
              List<Integer> result = new ArrayList<>();
              for(int i=0;i<size;i++){

               Node node =   list.poll();
               result.add(node.value);
               if(node.left!=null){
                 list.offer(node.left);
               }
               if(node.right!=null){
                 list.offer(node.right);
               }
              }
              res.add(result) ;

        }
        return res;

      }


}
