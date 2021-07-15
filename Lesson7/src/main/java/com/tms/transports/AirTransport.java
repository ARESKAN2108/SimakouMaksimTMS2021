package com.tms.transports;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AirTransport extends Transport {
    private double wingspan; // размах крыльев(м)
    private int minRunLength;

    public AirTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minRunLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunLength = minRunLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Воздушный транспорт: " +
                "размах крыльев: " + wingspan + "м" +
                ", minRunLength: " + minRunLength + "м";
    }
}
