package com.day2;

public class StringBufferEx {


    static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = a+b;
        System.out.println(a.toLowerCase());
       System.out.println(a);

       StringBuffer sb = new StringBuffer(a);
       sb.append(b);
       System.out.println(sb);
    }
}
