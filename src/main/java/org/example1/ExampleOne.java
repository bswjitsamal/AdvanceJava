package org.example1;

public class ExampleOne {

    int cc; //instance/ global ver
    static int zz= 10; // static ver


    static void main(String[] args) {
        int a =10; // premitive data type 8 bytes // local
        Integer b =Integer.valueOf(a); // collection or objects
        int c = b.intValue(); // viceversa

        String s = "MANISHA";
        int st = Integer.parseInt(s);

        a = b;
        System.out.println(a);

        b=a;
        System.out.println(b);

        //int c = 30; //8 bytes
        double d = 40; // 16 bytes
        d=  c;
        System.out.println(d); //30

        c= (int)d;
        System.out.println(c);

    }

}
