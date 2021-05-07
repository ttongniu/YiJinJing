package com.yijinjing.offer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;

public class Sution {

  public  static int  findStr(String str){
    int res=0 ;
    int start = 0;
    HashMap<Character , Integer>  map = new HashMap<>(16);

    for(int end=0;end <str.length();end++){
      if(map.containsKey(str.charAt(end))){
        start = Math.max(start,map.get(str.charAt(end))+1);
      }
      map.put(str.charAt(end),end);
      res = Math.max(res,end-start+1);
    }

    return res;

  }

  public static void main(String[] args) {
    System.out.println(findStr("abcacbbb"));
  }
}
