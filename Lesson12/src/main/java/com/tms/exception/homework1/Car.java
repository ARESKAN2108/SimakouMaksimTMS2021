package com.tms.exception.homework1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    private String carModel;
    private int maxSpeed;
    private int price;

    public Car() {
    }
    // в методе объявляем о возможном выбрасывании исключения
    // которое мы создали сами в отдельном классе
    public void startCar() throws ExceptionCar {
        Random random = new Random();
        int number = random.nextInt(21);
        if (number % 2 == 0) {
            // выбрасываем исключение и передаем его выше
            // вызывающему методу(у нас это метод main)
            throw new ExceptionCar("Автомобиль марки " + getCarModel() + " не завелся");
        } else {
            System.out.println("Автомобиль марки " + getCarModel() + " завелся");
        }
    }
}