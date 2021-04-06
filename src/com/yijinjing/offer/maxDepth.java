package com.yijinjing.offer;

public class maxDepth {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }

  public int maxDepAnInt(TreeNode root){
     if(root==null){
       return 0;
     }
     return 1+ Math.max(maxDepAnInt(root.left),maxDepAnInt(root.right));
  }


}
