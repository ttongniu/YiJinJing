package com.yijinjing.offer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
  public static void main(String[] args) {
    new MyThread(0, "A").start();
    new MyThread(1, "B").start();
    new MyThread(2, "C").start();
  }
}

class MyThread extends Thread {
  private static int       currentCount; // 线程共有，判断所有的打印状态
  private static Lock      lock      = new ReentrantLock(); // 线程共有，线程锁对象
  private static Condition condition = lock.newCondition();
  private        int       flag; // 0：打印A；1：打印B；2：打印C
  private String value;

  public MyThread(int flag, String value) {
    this.flag = flag;
    this.value = value;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      lock.lock();
      while (currentCount % 3 != flag) {
        try {
          condition.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.print(value); // 执行到这里，表明满足条件，打印
      currentCount++;
      condition.signalAll();
      lock.unlock();
    }
  }
}
