package com.yijinjing.offer;

/**
 * @author niutongtong
 */
public class Consume implements Runnable{

  private Store store;

  public Consume(Store store){
    this.store =store;
  }


  @Override
  public void run() {
    while (true){
      try {
        Thread.sleep(3000);
        store.consume();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }

  }
}
