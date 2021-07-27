package com.tms.exception.homework1;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("BMW", 245,14000);
        cars[1] = new Car("Mercedes", 230,10000);
        cars[2] = new Car("Toyota", 225,9000);
        for (Car car : cars) {
            try {
                car.startCar();
            } catch (ExceptionCar exceptionCar) {
                System.out.println(exceptionCar.getMessage());
            } finally {
                System.out.println("Проверка завершена\n");
            }
        }
    }
}
