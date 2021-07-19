package com.tms.homeWork;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GasTank {
    private final int totalTankVolume;
    private double fuelQuantity;

    public GasTank(int totalTankVolume, double fuelQuantity) {
        this.totalTankVolume = totalTankVolume;
        this.fuelQuantity = fuelQuantity;
    }

    public boolean getFuel() {
        if (fuelQuantity > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "totalTankVolume=" + totalTankVolume +
                ", fuelQuantity=" + fuelQuantity +
                '}';
    }
}
