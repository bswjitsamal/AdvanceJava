package org.example1;

import java.util.Arrays;

public class ArrayEx {

    static int b[] = {1,2,3,45,6,7,8};

    public static void show(){
        int[] a=new int[5];
        a[0]=5;
        a[1]=15;
        a[2]=25;
        a[3]=35;
    }



    static void main(String[] args) {
        int max=0;
       for(int i=0;i<= b.length-1;i++){
           for(int j = i+1;j<= b.length-1;j++){
               if(b[i]<b[j] && max<b[j])
                   max = b[j];
           }
       }

       System.out.println("The higest item in the array is: "+max);

       // Arrays.stream(b).boxed().forEach(System.out::println); //lambda or java 8 using streams
    }

    //int, char, bool, -- premitive data type
    //Integer, Character, String, Boolean // object datatypes
}
