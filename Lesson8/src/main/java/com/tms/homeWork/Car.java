package com.tms.homeWork;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private final Engine engine;
    private final GasTank gasTank;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void carOn() {
        System.out.println("Заводим машину");
        engine.engineOn();
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
