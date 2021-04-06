package com.yijinjing;

import java.util.HashMap;

public class nttCache {
  
     
    private class Node {
         private  int key ;
         private  int value;
         
         private Node pre;
         private Node next;
         
         public  Node(){}
         public  Node(int key,int value){
            this.key = key;
            this.value = value;
         }
    }
    
    private Node dummyHead=new Node();
    private Node dummyTail = new Node();
    private HashMap<Integer,Node>  hashMap = new HashMap<>(16);
    private  int cacheCity ;
    private  int size ;
    
    public  nttCache(int cacheCity){
          dummyHead.next = dummyTail;
          dummyTail.pre = dummyHead;
          this.cacheCity =cacheCity;
          this.size=0;
    }
    
    private void  add(Node node){
       Node   originNode =  dummyHead.next;
       dummyHead.next =node;
       node.next = originNode;
       node.pre = dummyHead;
       originNode.pre=node;
    }
    
    private  void del(Node node){
        Node nextNode = node.next;
        Node preNode = node.pre;
        preNode.next = nextNode;
        nextNode.pre = preNode;
        node.next =null;
        node.pre=null;
    }
    
    public  int get(int key){
      Node node =   hashMap.get(key);
      if(node==null){
        return  -1;
     
      }
      del(node);
      add(node);
      return  node.value;
    }
    
    public void  put(int key,int value ){
     Node node  =   hashMap.get(key);
     if(node!=null){
      node.value =value;
      del(node);
      add(node);
     }else {
       
       if(size<cacheCity){
         size++;
       }else {
           Node delNode =   dummyTail.pre;
           del(delNode);
           hashMap.remove(delNode.key);
       }
       Node  newNode =  new Node(key,value);
       add(newNode);
       hashMap.put(key,newNode);
     }

    }

  public static void main(String[] args) {
    nttCache lRUCache = new nttCache(2);
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
