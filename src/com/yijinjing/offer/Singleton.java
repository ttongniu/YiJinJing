package com.yijinjing.offer;

/**
 * The type Singleton.
 */
public class Singleton {

  /**
   * 单例模式，懒汉式，使用静态内部类，线程安全【推荐】
   */
  public static class Singleton5 {
    private final static class SingletonHolder {
      private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {

    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static Singleton5 getInstance() {
      return SingletonHolder.INSTANCE;
    }
  }


  /**
   * 静态内部类，使用枚举方式，线程安全【推荐】
   */
  public enum Singleton6 {
    /**
     * Instance singleton 6.
     */
    INSTANCE;

    /**
     * Whatever method.
     */
    public void whateverMethod() {

    }
  }


  /**
   * 静态内部类，使用双重校验锁，线程安全【推荐】
   */
  public static class Singleton7 {
    private volatile static Singleton7 instance = null;

    private Singleton7() {

    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static Singleton7 getInstance() {
      if (instance == null) {
        synchronized (Singleton7.class) {
          if (instance == null) {
            instance = new Singleton7();
          }
        }
      }

      return instance;
    }
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    System.out.println(Singleton5.getInstance() == Singleton5.getInstance());
    System.out.println(Singleton6.INSTANCE == Singleton6.INSTANCE);
    System.out.println(Singleton7.getInstance() == Singleton7.getInstance());
  }



}
