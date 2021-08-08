package homework4;

import homework4.some_car.Car;
import homework4.some_car.Engine;
import homework4.some_car.FuelTank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Car[] cars = {new Car("BMW", 230, 10000, new Engine("Дизельный", 6), new FuelTank("Дизельное", 60)),
                new Car("Toyota", 240, 15000, new Engine("Бензиновый", 8), new FuelTank("АИ-95", 55))};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lesson14/src/main/java/homework4/Car.data"))) {
            oos.writeObject(cars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
