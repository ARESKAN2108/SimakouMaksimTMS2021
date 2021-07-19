package com.tms.homeWork;

public class Main {
    public static void main(String[] args) {
        // создем машину с двигателем и баком, изменить нельзя
        Car car = new Car(new Engine("Дизельный", 3), new GasTank(60, 5));
        System.out.println(car);
        car.carOn(); // Включаем машину и двигатель соответственно
        car.wentCar(); // машина поехала
    }
}
