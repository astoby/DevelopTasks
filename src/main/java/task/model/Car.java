package task.model;

public class Car {
    private int id;
    private String model;
    private String manufacturer;
    private String registredNumber;

    public Car(int id, String model, String manufacturer, String registredNumber) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.registredNumber = registredNumber;
    }

    @Override
    public String toString() {
        return "\n- " +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", registredNumber='" + registredNumber + '\'';
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getRegistredNumber() {
        return registredNumber;
    }
}
