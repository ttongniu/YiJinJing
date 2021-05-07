package com.yijinjing.offer;

import java.util.concurrent.*;

/**
 * @author niutongtong
 */
public class Dome {


  public static void main(String[] args) {
    /*Store store =new Store();
    Thread p1 = new Thread(new Produce(store));
    Thread p2 = new Thread(new Produce(store));
    Thread p3 = new Thread(new Produce(store));
    Thread c1 = new Thread(new Consume(store));
    Thread c2 = new Thread(new Consume(store));
    Thread c3 = new Thread(new Consume(store));

    p1.start();
    p2.start();
    p3.start();
    c1.start();
    c2.start();
    c3.start();*/
    ThreadPoolExecutor poolExecutor =new ThreadPoolExecutor(8, 16, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new ThreadFactory() {
      @Override
      public Thread newThread(Runnable r) {
        Thread t =new Thread(r,"ntt-task");
        return t;
      }
    });
    Store store =new Store();
    poolExecutor.execute(new Produce(store));
    poolExecutor.execute(new Consume(store));
    poolExecutor.execute(new Consume(store));

  }

}
