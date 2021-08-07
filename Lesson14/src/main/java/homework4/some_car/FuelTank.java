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
public class FuelTank implements Serializable {
    private String fuelType;
    private int fuelTankVolume;
}
