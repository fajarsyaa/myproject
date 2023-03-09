package latihan.aplication;

import latihan.data.Avanza;
import latihan.data.Bus;
import latihan.data.Car;

public class AvanzaApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
        car.drive();

        Car bus = new Bus();
        System.out.println(bus.getTire());
        System.out.println(bus.getBrand());
        System.out.println(bus.isMaintenance());
        System.out.println(bus.isBig());
        bus.drive();
    }
}
