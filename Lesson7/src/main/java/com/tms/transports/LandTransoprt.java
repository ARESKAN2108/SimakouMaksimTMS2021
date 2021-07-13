package com.tms.transports;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LandTransoprt extends Transport {
    private int wheel;
    private double fuelConsumption;

    public LandTransoprt(int power, int maxSpeed, int weight, String brand, int wheel, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.wheel = wheel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Наземный: " +
                "количество колес: " + wheel +
                ", расход топлива: " + fuelConsumption + " л/100км."
                + " ";
    }

}
