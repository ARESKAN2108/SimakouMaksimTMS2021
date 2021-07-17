package com.tms.homeWork;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GasTank {
    private final int totalTankVolume;


    public GasTank(int totalTankVolume) {
        this.totalTankVolume = totalTankVolume;
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "totalTankVolume=" + totalTankVolume +
                '}';
    }
}
