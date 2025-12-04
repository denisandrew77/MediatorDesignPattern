package Models;

public class Scooter extends TransportationMethod{
    private int batteryLevel;

    public Scooter(int location, String name,  int batteryLevel) {
        super(location,name);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
