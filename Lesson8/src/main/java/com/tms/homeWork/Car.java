package com.tms.homeWork;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private final Engine engine;
    private GasTank gasTank;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void carOn() {
        System.out.println("Заводим машину");
        if (gasTank.getFuel()) {
            engine.engineOn();
        }else {
            System.out.println("Бак пустой, нужно заправиться");
        }

    }

    public void wentCar() {
        System.out.println("Машина поехала...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", gasTank=" + gasTank +
                '}';
    }
}
