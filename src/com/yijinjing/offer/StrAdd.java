package com.yijinjing.offer;

public class StrAdd {

  public  static String addStrings(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--){
      int x = i < 0 ? 0 : num1.charAt(i) - '0';
      int y = j < 0 ? 0 : num2.charAt(j) - '0';
      sb.append((x + y + carry) % 10);
      carry = (x + y + carry) / 10;
    }
    if(carry != 0)
      sb.append(carry);
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(addStrings("1","99"));
  }

}
