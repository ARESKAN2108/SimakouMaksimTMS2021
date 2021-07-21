package com.tms.homeWork;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GasTank {
    private int totalTankVolume;
    private double fuelQuantity;

    public GasTank(int totalTankVolume, double fuelQuantity) {
        this.totalTankVolume = totalTankVolume;
        this.fuelQuantity = fuelQuantity;
    }
}
