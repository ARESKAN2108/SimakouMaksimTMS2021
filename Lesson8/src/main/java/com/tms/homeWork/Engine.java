package com.tms.homeWork;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Engine {
    private final String enginesType;
    public final double volume;

    public Engine(String enginesType, double volume) {
        this.enginesType = enginesType;
        this.volume = volume;
    }

    public void engineOn() {
        System.out.println("Двигатель включен");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginesType='" + enginesType + '\'' +
                ", volume=" + volume +
                '}';
    }
}
