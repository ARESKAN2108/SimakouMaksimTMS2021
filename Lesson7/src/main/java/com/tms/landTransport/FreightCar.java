package com.tms.landTransport;

import com.tms.transports.LandTransoprt;
import com.tms.transports.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FreightCar extends LandTransoprt {
    private int liftingCapacity; //грузоподъемность
    private static final double WEIGHT_IN_TONS = 20;

    public FreightCar(int power, int maxSpeed, int weight, String brand, int wheel, double fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, brand, wheel, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }


    public void getWeighting(double cargoWeight) {
        if (cargoWeight < WEIGHT_IN_TONS ) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }


    public String getInfoOfFreightCar() {
        return super.toString() +
                "Грузовой: " +
                "грузоподъемность: " + liftingCapacity + "т.";
    }


}
