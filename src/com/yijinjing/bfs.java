package com.yijinjing;

import javax.swing.tree.TreeNode;
import java.util.*;

public class bfs {

  public void levelOrder(TreeNode root) {

    //层次遍历使用的就是bfs
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    Queue<TreeNode> queue = new Queue<TreeNode>() {
      @Override
      public boolean add(TreeNode treeNode) {
        return false;
      }

      @Override
      public boolean offer(TreeNode treeNode) {
        return false;
      }

      @Override
      public TreeNode remove() {
        return null;
      }

      @Override
      public TreeNode poll() {
        return null;
      }

      @Override
      public TreeNode element() {
        return null;
      }

      @Override
      public TreeNode peek() {
        return null;
      }

      @Override
      public int size() {
        return 0;
      }

      @Override
      public boolean isEmpty() {
        return false;
      }

      @Override
      public boolean contains(Object o) {
        return false;
      }

      @Override
      public Iterator<TreeNode> iterator() {
        return null;
      }

      @Override
      public Object[] toArray() {
        return new Object[0];
      }

      @Override
      public <T> T[] toArray(T[] a) {
        return null;
      }

      @Override
      public boolean remove(Object o) {
        return false;
      }

      @Override
      public boolean containsAll(Collection<?> c) {
        return false;
      }

      @Override
      public boolean addAll(Collection<? extends TreeNode> c) {
        return false;
      }

      @Override
      public boolean removeAll(Collection<?> c) {
        return false;
      }

      @Override
      public boolean retainAll(Collection<?> c) {
        return false;
      }

      @Override
      public void clear() {

      }
    };
    if(root==null) {

    }

  }


}
