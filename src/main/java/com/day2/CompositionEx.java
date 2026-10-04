package com.day2;

public class CompositionEx {
    static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

class Engine{
    public void start(){
        System.out.println("Engine started... bruummmm....");
    }
}

class Car{
    private Engine engine;
    Car(){
        engine = new Engine();
    }

    void start(){
        engine.start();
        System.out.println("car is moving...");
    }
}
