package com.yijinjing.offer;

public class getKthFromEnd {

  public class ListNode {
     int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

  public ListNode getNode(ListNode node , int k ){
         ListNode  fast     =  node  ;
         ListNode  slow   =node;
         while (k>0){
           fast= fast.next;
           k--;
         }

         while (fast!=null){
           fast=fast.next;
           slow=slow.next;
         }

      return  slow;
  }


}
