package com.yijinjing.kuaishou;

/**
 * 现在有两个很大的整数用String表示，返回两数相加之和。
 * ip 字符串转整型
 * 字符串换行输出
 * based vshh ndnd hah sjjsjs
 * 给定一个由多个单词组成的字符串，单词之间可能包含多个空格。现给定一个数值10，表示截取的字符串长度（假设该数值一定大于每个单词）
 * 岛屿数量
 * 链表数字相加
 */
public class test1 {
   public   static String    addStrings(String num1,String num2){

     int i = num1.length()-1;
     int j = num2.length()-1;
     int carry =0;
     StringBuilder  ans =new StringBuilder();
     while (i>=0||j>=0){
       
       int n1= i>=0? num1.charAt(i)-'0':0;
       int n2 = j>=0?num2.charAt(j)-'0':0;
       int tem = n1+n2+carry;
       carry=tem/10;
       ans.append(tem%10);
       i--;
       j--;
     }
  if(carry==1){
      ans.append(1);
  }
   return  ans.reverse().toString();
   }

  public static void main(String[] args) {
    System.out.println(addStrings("88","88"));
  }

}
