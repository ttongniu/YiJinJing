package com.yijinjing.offer;

/**
 * 定义一个虚拟头节点 dummy 指向 head，pre 指针初始指向 dummy。
 *
 * 循环遍历链表，pre 往后移动。当指针 pre.next 指向的节点的值等于 val 时退出循环，将 pre.next 指向 pre.next.next，然后返回 dummy.next。
 */
public class del {

  public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    public ListNode deleteNode(ListNode head, int val) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode pre = dummy;
      while (pre.next != null && pre.next.val != val) {
        pre = pre.next;
      }
      pre.next = pre.next == null ? null : pre.next.next;
      return dummy.next;
    }
}
