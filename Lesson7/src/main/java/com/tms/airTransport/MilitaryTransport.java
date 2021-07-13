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

    public void makeShot() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла...");
            numberOfMissiles--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void checkEjectionSystem() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }


    public String getInfoOfMilitaryTransport() {
        return super.toString() +
                ". Военный: " +
                "система катапультирования: " + ejectionSystem +
                ", кол-во ракет: " + numberOfMissiles + ".";
    }
}
