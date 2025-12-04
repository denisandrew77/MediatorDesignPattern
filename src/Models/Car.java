package Models;

public class Car extends  TransportationMethod{
    private boolean occupied;

    public Car(int location,  String name) {
        super(location, name);
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
