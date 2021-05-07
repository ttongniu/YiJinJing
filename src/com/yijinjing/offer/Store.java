package com.yijinjing.offer;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author niutongtong
 */
public class Store {

   LinkedBlockingQueue<Object>  queue = new LinkedBlockingQueue(10);

   public void produce(){

      try {
         queue.put(new Object());
         System.out.println("生产者：+"+ Thread.currentThread().getName() +"生产产品数量"+ queue.size()  );
      } catch (InterruptedException e) {
         e.printStackTrace();
      }


   }

   public void consume(){
      try {
         queue.take();
         System.out.println("消费者：+"+ Thread.currentThread().getName() +"现存产品数量"+ queue.size() );
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }


}
