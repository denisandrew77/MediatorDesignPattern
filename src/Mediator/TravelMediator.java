package Mediator;

import Models.Car;
import Models.Human;
import Models.Scooter;
import Models.TransportationMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class TravelMediator {
    private Human human;
    private ArrayList<TransportationMethod> transportationMethods;
    //treemap
    public TravelMediator(Human human, ArrayList<TransportationMethod> transportationMethods)
    {
        this.human = human;
        this.transportationMethods = transportationMethods;
    }
    public void travelTo(Human human, int distance){
        TreeMap<Integer, Car> availableCars = new TreeMap<Integer, Car>();
        TreeMap<Integer, Scooter> availableScooters = new TreeMap<Integer, Scooter>();
        ArrayList<String> options  = new ArrayList<String>();
        for(TransportationMethod method : this.transportationMethods){
            if(method instanceof Car && ((Car) method).isOccupied()==false){
                System.out.println(method.getName());
                int travelToHuman = human.getLocation() - method.getLocation();
                if(travelToHuman < 0) travelToHuman = travelToHuman * -1;
                availableCars.put(travelToHuman, (Car)method);
            }
            else if(method instanceof Scooter){
                if(((Scooter) method).getBatteryLevel() >= distance/2){
                    availableScooters.put(((Scooter) method).getBatteryLevel(), (Scooter) method);
                }
            }
        }
        int counter = 1;
        for(Car car : availableCars.values()){
            if(counter<=3){
                options.add(car.getName());
            }
            counter++;
        }
        for(Scooter scooter : availableScooters.values()){
            options.add(scooter.getName());
        }
        human.receiveOffers(options);
    }
}
