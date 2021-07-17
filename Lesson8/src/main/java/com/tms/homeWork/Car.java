package com.tms.homeWork;

public class Car {
    public final Engine engine = new Engine();

    public void carOn() {
        System.out.println("Заводим машину");
        engine.engineOn();
    }
}
