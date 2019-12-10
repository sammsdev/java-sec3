package Sec6;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colours;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        this.model = validModel.equals("carrera") || validModel.equals("commodore") ? validModel : "unknown";
    }

    public String getModel() {
        return this.model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }
}
