package Models;

public abstract class TransportationMethod {
    private int location;
    private String name;
    public TransportationMethod(int location, String name)
    {
        this.location = location;
        this.name = name;
    }
    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
