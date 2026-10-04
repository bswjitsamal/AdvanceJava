package com.day2;

public class Department{
    String name;
    Department(String name){
        this.name=name;
    }
}

class Teacher{
    String name;
    //Department department; //Aggregation..
    Teacher(String name, Department department){
        this.name=name;
        //this.department=department;
    }

    /*void display(){
        System.out.println(name +" Belongs to "+department.name);
    }*/
}

class Test{
    public static void main(String[] args){
        Department department=new Department("CSA");
        Teacher teacher=new Teacher("Manisha",department);
        //teacher.display();
    }
}
