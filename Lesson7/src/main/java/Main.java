
import com.tms.airTransport.CivilTransport;
import com.tms.airTransport.MilitaryTransport;
import com.tms.landTransport.Car;
import com.tms.landTransport.FreightCar;
import com.tms.transports.LandTransoprt;
import com.tms.transports.Transport;

public class Main {
    public static void main(String[] args) {
        FreightCar freightCar = new FreightCar(412,85,13000,"МАЗ",10,41.2,20);
        Car car = new Car(163,223,1485,"BMW",4,5.9, "E60", 5);
        CivilTransport civilTransport = new CivilTransport(25000,850,41140,"Boeing",34.3,1630,189,false);
        MilitaryTransport militaryTransport = new MilitaryTransport(12000,2600,18500,"Су-57",14,350,true,34);

        System.out.print(freightCar.getInfoOfFreightCar());
        System.out.println(freightCar.powerCalculation(freightCar.getPower())); // мощность в киловаттах

        System.out.print(car.getInfoCar());
        System.out.println(car.powerCalculation(car.getPower()));

        System.out.print(civilTransport.getInfoOfTransportCivil());
        System.out.println(civilTransport.powerCalculation(civilTransport.getPower()));

        System.out.print(militaryTransport.getInfoOfMilitaryTransport());
        System.out.println(militaryTransport.powerCalculation(militaryTransport.getPower()));

        car.distanceCalculation(2.5);
        freightCar.getWeighting(15);
    }
}
