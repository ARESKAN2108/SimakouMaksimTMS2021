package com.tms.landTransport;

import com.tms.transports.LandTransoprt;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter

public class FreightCar extends LandTransoprt {
    private int liftingCapacity; //грузоподъемность
    private static final double WEIGHT_IN_TONS = 20;

    public FreightCar(int power, int maxSpeed, int weight, String brand, int wheel, double fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, brand, wheel, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }


    public String checkLiftingCapacity() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите массу груза в тоннах, которым вы хотите заполнить наш грузовик");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value < WEIGHT_IN_TONS) {
                    return "Грузовик будет загружен";
                } else {
                    return "Вам нужен грузовик побольше";
                }
            } else {
                System.out.println("Вы ввели некорректные данные");
                scanner.next();
            }
        }
    }

    public String getInfoOfFreightCar() {
        return super.toString() +
                "Грузовой: " +
                "грузоподъемность: " + liftingCapacity + "т.";
    }
}
