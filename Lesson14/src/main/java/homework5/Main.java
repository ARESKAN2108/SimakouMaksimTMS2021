package homework5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try (FileInputStream fileInputStream = new FileInputStream("Lesson14/src/main/java/homework5/car.json")) {
            Car car = objectMapper.readValue(fileInputStream, Car.class);
            System.out.println(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
