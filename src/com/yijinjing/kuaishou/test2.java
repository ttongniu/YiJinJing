package com.yijinjing.kuaishou;

/**
 *  链表排序
 *  链表折半
 *  两个链表合并排序
 *
 */
public class test2 {

  private class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

  public ListNode  sortList(ListNode head){
     if(head==null ||head.next==null){
        return head;
     }
     ListNode midNode = getMid(head);
    return  merge(sortList(head),sortList(midNode)) ;
  }

  private ListNode getMid(ListNode head) {
    ListNode q = head;
    ListNode s = head;
    while (q.next!=null && q.next.next!=null){
       q = q.next.next;
       s = s.next;
    }
    ListNode midNode = s.next;
    s.next =null;
    return  midNode;
  }

  private ListNode merge(ListNode l1, ListNode l2) {
      ListNode dd = new ListNode(-1);
      ListNode l3 =dd;
      while (l1.next!=null && l2.next!=null){
           if(l1.val<l2.val){
             l3.next =l1;
             l1=l1.next;
           }else {
            l3.next =l2;
            l2=l2.next;
           }
           l3=l3.next;
      }

      if(l1!=null){
        l3.next=l1;
      }
      if(l2!=null){
        l3.next=l2;
      }
      return dd.next;
  }


}
