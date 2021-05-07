package com.yijinjing.offer;

public class reverseList {

  //
  public ListNode reverseList(ListNode head){
        ListNode  pre=null , cur=head ;
        while (cur!=null){
          ListNode tem = cur.next;
          cur.next = pre;
          pre = cur;
          cur =tem;
        }
        return  pre;
  }


}
