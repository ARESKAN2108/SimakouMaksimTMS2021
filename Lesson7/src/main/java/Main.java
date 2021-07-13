
import com.tms.airTransport.CivilTransport;
import com.tms.airTransport.MilitaryTransport;
import com.tms.landTransport.Car;
import com.tms.landTransport.FreightCar;

public class Main {
    public static void main(String[] args) {
        FreightCar freightCar = new FreightCar(412,85,13000,"МАЗ",10,41.2,20);
        Car car = new Car(163,223,1485,"BMW",4,5.9, "E60", 5);
        CivilTransport civilTransport = new CivilTransport(25000,850,41140,"Boeing",34.3,1630,189,false);
        MilitaryTransport militaryTransport = new MilitaryTransport(12000,2600,18500,"Су-57",14,350,true,10);

        System.out.print(freightCar.getInfoOfFreightCar());
        System.out.println(freightCar.powerCalculation(freightCar.getPower())); // мощность для грузовой машины

        System.out.print(car.getInfoCar());
        System.out.println(car.powerCalculation(car.getPower())); //мощность для легковой машины

        System.out.print(civilTransport.getInfoOfTransportCivil());
        System.out.println(civilTransport.powerCalculation(civilTransport.getPower())); //мощность для гражданского самолёта

        System.out.print(militaryTransport.getInfoOfMilitaryTransport());
        System.out.println(militaryTransport.powerCalculation(militaryTransport.getPower())); //мощность для военного самолёта

        car.calculateDistanceAndFuel(2.5); // вывод длинной строки про легковой автомобиль

        System.out.println(freightCar.checkLiftingCapacity()); // проверка грузоподъемности грузовика

        System.out.println(civilTransport.checkCapacityPessengers()); // проверка на вместимость пассажиров

        for (int i = militaryTransport.getNumberOfMissiles(); i >= 0; i--) { //стреляем пока не закончатся боеприпасы
            militaryTransport.makeShot();
        }

        militaryTransport.checkEjectionSystem(); // проверка наличия катапультрования
    }
}
