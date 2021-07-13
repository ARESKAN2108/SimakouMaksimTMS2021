package com.tms.airTransport;

import com.tms.transports.AirTransport;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

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

    public String checkCapacityPessengers() {
        Scanner scanner = new Scanner(System.in);
        int numberOfSeats = 80;
        while (true) {
            System.out.println("Скольких пассажиров вы хотите вместить в самолет?");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value < numberOfSeats) {
                    return "Столько количество мест имеется, готовимся на посадку пассажиров";
                } else {
                    return "Вам нужен самолет побольше";
                }
            } else {
                System.out.println("Вы ввели некорректные данные");
                scanner.next();
            }
        }
    }

    public String getInfoOfTransportCivil() {
        return super.toString() +
                ". Гражданский: " +
                "количество пассажиров: " + numbersOfPassengers +
                ", наличие бизнес класса: " + businessClass + ".";
    }
}
