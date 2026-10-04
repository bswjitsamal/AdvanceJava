package com.manisha;

public class Tst {

    static void main(String[] args) {
        Parent p = new Parent();
        p.show(); // parent

        Child c = new Child();
        c.show(); // child
        System.out.println(c.a);


        //Upcating
        Parent p2 = new Child();
        p2.show(); // Parent

        //Downcasting
        Child c2 = (Child)p2;
        System.out.println(c2.a);
    }
}
