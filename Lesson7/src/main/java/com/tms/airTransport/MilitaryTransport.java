package com.tms.airTransport;

import com.tms.transports.AirTransport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MilitaryTransport extends AirTransport {
    private boolean ejectionSystem;
    private int numberOfMissiles;

    public MilitaryTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunLength, boolean ejectionSystem, int numberOfMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, minRunLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }


    public String getInfoOfMilitaryTransport() {
        return super.toString() +
                ". Военный: " +
                "система катапультирования: " + ejectionSystem +
                ", кол-во ракет: " + numberOfMissiles + ".";
    }
}
