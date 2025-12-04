import Mediator.TravelMediator;
import Models.Car;
import Models.Human;
import Models.Scooter;
import Models.TransportationMethod;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human = new Human(1,"Gigi");
        Car car1 = new Car(46, "car1");
        Car car2 = new Car(45, "car2");
        Car car3 = new Car(12, "car3");
        Car car4 = new Car(47, "car4");
        Car car5 = new Car(1, "car5");

        car3.setOccupied(true);
        Scooter scooter1 = new Scooter(35, "scooter1", 100);
        Scooter scooter2 = new Scooter(20, "scooter2", 10);
        Scooter scooter3 = new Scooter(20, "scooter3", 30);

        ArrayList<TransportationMethod> methods = new ArrayList<TransportationMethod>();
        methods.add(car1);
        methods.add(car2);
        methods.add(car3);
        methods.add(car4);
        methods.add(car5);
        methods.add(scooter1);
        methods.add(scooter2);
        methods.add(scooter3);

        TravelMediator travelMediator = new TravelMediator(human, methods);
        travelMediator.travelTo(human, 40);
    }
}