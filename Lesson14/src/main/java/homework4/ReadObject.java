package homework4;

import homework4.some_car.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lesson14/src/main/java/homework4/Car.data"))) {
            Car[] cars = (Car[]) ois.readObject();
            for (Car car : cars) {
                System.out.println(car);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
