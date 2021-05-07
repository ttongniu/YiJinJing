package com.yijinjing.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kopK {

  public static List<Integer> findKLargestNumbers(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
    // 首先向最小堆中插入K个元素
    for (int i = 0; i < k; i++) {
      minHeap.add(nums[i]);
    }

    // 迭代数组中的剩余元素，如果他比堆中最小元素大，那么删除堆中最小的元素，把它插进去
    for (int i = k; i < nums.length; i++) {
      if (nums[i] > minHeap.peek()) {
        minHeap.poll();
        minHeap.add(nums[i]);
      }
    }

    //这时候留在堆里面的就是前K大元素
    return new ArrayList<>(minHeap);
  }

  public static List<Integer> findKNumbers(int[] nums, int k) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);
    // 首先向最小堆中插入K个元素
    for (int i = 0; i < k; i++) {
      maxHeap.add(nums[i]);
    }

    //
    for (int i = k; i < nums.length; i++) {
      if (nums[i] < maxHeap.peek()) {
        maxHeap.poll();
        maxHeap.add(nums[i]);
      }
    }

    //这时候留在堆里面的就是前K大元素
    return new ArrayList<>(maxHeap);
  }

  public static void main(String[] args) {
    System.out.println(findKLargestNumbers(new int[] {
      1,4,3,6,7,0
    },3));

    System.out.println(findKNumbers(new int[] {
      1,4,3,6,7,0
    },3));
  }


}
