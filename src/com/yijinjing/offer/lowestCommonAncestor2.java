package com.yijinjing.offer;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 *
 *
 * 示例 1:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 * 示例  2:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * 输出: 5
 * 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
 * 说明:
 *
 * 所有节点的值都是唯一的。
 * p、q 为不同节点且均存在于给定的二叉树中。
 * 解法
 * 根据“最近公共祖先”的定义，若 root 是 p, q 的最近公共祖先 ，则只可能为以下情况之一：
 *
 * 如果 p 和 q 分别是 root 的左右节点，那么 root 就是我们要找的最近公共祖先；
 * 如果 p 和 q 都是 root 的左节点，那么返回 lowestCommonAncestor(root.left, p, q)；
 * 如果 p 和 q 都是 root 的右节点，那么返回 lowestCommonAncestor(root.right, p, q)。
 * 边界条件讨论：
 *
 * 如果 root 为 null，则说明我们已经找到最底了，返回 null 表示没找到；
 * 如果 root 与 p 相等或者与 q 相等，则返回 root；
 * 如果左子树没找到，递归函数返回 null，证明 p 和 q 同在 root 的右侧，那么最终的公共祖先就是右子树找到的结点；
 * 如果右子树没找到，递归函数返回 null，证明 p 和 q 同在 root 的左侧，那么最终的公共祖先就是左子树找到的结点。
 */
public class lowestCommonAncestor2 {
  public class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  public TreeNode  lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

    if (root == null || root == p || root == q) return root;
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if (left == null) {
      return right;
    }
    if (right == null) {
      return left;
    }
    return root;

  }



}
