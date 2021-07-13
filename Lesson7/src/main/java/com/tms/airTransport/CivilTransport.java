package com.tms.airTransport;

import com.tms.transports.AirTransport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CivilTransport extends AirTransport {
    private int numbersOfPassengers;
    private boolean businessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minRunLength, int numbersOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunLength);
        this.numbersOfPassengers = numbersOfPassengers;
        this.businessClass = businessClass;
    }

    public String getInfoOfTransportCivil() {
        return super.toString() +
                ". Гражданский: " +
                "количество пассажиров: " + numbersOfPassengers +
                ", наличие бизнес класса: " + businessClass + ".";
    }
}
