package homework4.some_car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car implements Serializable {
    private String brand;
    private int maxSpeed;
    private int price;
    private Engine engine;
    private FuelTank fuelTank;

}
