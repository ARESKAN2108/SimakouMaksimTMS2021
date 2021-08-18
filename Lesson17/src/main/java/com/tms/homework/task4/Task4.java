package com.tms.homework.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017),
                new Car("AI3838SS", 2019)); //добавил свой номер для проверки

        List<String> carNumbers = cars.stream()
                .filter(car -> car.getNumber() != null)
                .filter(car -> car.getNumber().length() == 8)
                .filter(car -> car.getYear() > 2010)
                .map(Car::getNumber)
                .collect(Collectors.toList());
        carNumbers.forEach(System.out::println);
    }
}
