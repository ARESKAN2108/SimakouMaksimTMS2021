package com.tms.landTransport;

import com.tms.transports.LandTransoprt;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car extends LandTransoprt {
    private String bodyType;
    private int passengers;


    public Car(int power, int maxSpeed, int weight, String brand, int wheel, double fuelConsumption, String bodyType, int passengers) {
        super(power, maxSpeed, weight, brand, wheel, fuelConsumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    // не нравится мне стиль метода который я зделал
    public void calculateDistanceAndFuel(double time) {
        double distance = time * getMaxSpeed();
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью "
                + getMaxSpeed() + "км/ч" + " проедет " + distance + " км и израсходует топлива " + countFuelConsumption(Math.round(distance)) + " л.");
    }

    private double countFuelConsumption(double distance) {
        return Math.floor(getFuelConsumption() / 100 * distance);
    }

    public String getInfoCar() {
        return super.toString() +
                "Автомобиль" +
                " Тип кузова: " + bodyType +
                ", количество пассажиров: " + passengers + ".";
    }
}
