package com.yijinjing;

import java.util.HashMap;

/**
 * @author niutongtong
 */
public class mylru {

  //1. 双向链表定义   --  头尾虚节点 避免进行null 判断   写头插与删除
      private class Node {
 
         private  int  key;
         private  int  value;
         private Node pre;
         private Node next;



        public  Node(){}

         public  Node ( int key ,int value  ){
            this.key =key;
            this.value = value;
         }

      }

      //虚头
      private  Node dummyHead = new Node();

      //虚尾
     private   Node dummyTail = new Node();

     private   int  cacheCity;
     private   int    size;

     private HashMap<Integer,Node>  hashMap = new HashMap<>(16);

     public   mylru(int cacheCity){
         dummyHead.next = dummyTail;
         dummyTail.pre = dummyHead;
         this.cacheCity= cacheCity;
         this.size = 0;
     }
     
      //1. 头插
    private void add(Node node){
          Node  originHead   =  dummyHead.next;
          dummyHead.next    =   node;
          node.pre = dummyHead;
          node.next =   originHead;
          originHead.pre = node;
    }
      //2. 删除节点
    private void del(Node node){
       Node preNode = node.pre;
       Node nextNode =node.next;
       preNode.next= nextNode;
       nextNode.pre =preNode;
       node.pre=null;
       node.next=null;
    }
      //2. hashmap
   public   int   get(int key){
       Node node = hashMap.get(key);
       if(node==null){
          return -1;
       }
       del(node);
       add(node);
       return node.value;
   }

   public void put(int key ,int value){

       Node node = hashMap.get(key);
       if(node!=null){
          node.value = value;
          del(node);
          add(node);
       }else {
         if(size<cacheCity){
             size++;
         }else {
           //删除尾
           Node delNode = dummyTail.pre;
           hashMap.remove(delNode.key);
           del(delNode);
         }
        Node  newNode = new Node(key,value);
         add(newNode);
       hashMap.put(key,newNode);
       }

   }

  public static void main(String[] args) {
    mylru lRUCache = new mylru(2);
    lRUCache.put(1, 1); // 缓存是 {1=1}
    lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
    lRUCache.get(1);    // 返回 1
    lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
    lRUCache.get(2);    // 返回 -1 (未找到)
    lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
    lRUCache.get(1);    // 返回 -1 (未找到)
    lRUCache.get(3);    // 返回 3
    lRUCache.get(4);    // 返回 4


  }

}
