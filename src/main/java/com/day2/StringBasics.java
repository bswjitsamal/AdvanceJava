package com.day2;

import java.util.Arrays;

public class StringBasics {

    public static void display(String str) {
        char[] ch = str.toCharArray();
        System.out.print(Arrays.toString(ch));

        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i]);
            if(Character.isUpperCase(ch[i])){
                System.out.print(ch[i]);
            }
        }
    }

    public static void main(String[] args) {
        String a = "Manisha Officer";
        display(a);

        System.out.println();

        String aa= "abc";
        String bb = "abc";
        String cc = new String("abc");
        System.out.println(aa==bb);//true - address
        System.out.println(aa.equals(bb));//true -compares the value

        System.out.println(cc==aa); //true
        System.out.println(aa.equals(cc)); //false
    }
}
