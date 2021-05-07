package com.yijinjing.offer;

/**
 * @author niutongtong
 */
public class Produce implements Runnable{

  private Store store;

  public Produce(Store store){
    this.store=store;
  }


  @Override
  public void run() {
    while (true){
      try {
        Thread.sleep(1000);
        store.produce();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
