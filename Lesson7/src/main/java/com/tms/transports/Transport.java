package com.tms.transports;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Информация транспорта: " +
                "мощность = " + power + " л/c" +
                ", максимальная скорость: " + maxSpeed + "км/ч" +
                ", масса: " + weight + "кг" +
                ", марка: " + brand;
    }

    public double powerCalculation(int power) {
        this.power = power;
        double powerCalculate = power * 0.74;
        System.out.print("Мощность в киловаттах = ");
        return Math.floor(powerCalculate);
    }

}
