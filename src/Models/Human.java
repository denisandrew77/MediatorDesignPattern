package Models;

import java.util.ArrayList;

public class Human {
    private int location;
    private String name;
    public Human(int location, String name) {
        this.location = location;
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void receiveOffers(ArrayList<String> offers) {
        System.out.println(offers);
        for (String offer : offers) {
            System.out.println(this.name + " received offer: " + offer);
        }
    }
}
