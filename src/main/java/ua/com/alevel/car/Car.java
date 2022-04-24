package ua.com.alevel;

public class Car {

    public Car(String name, String model, String id, Double price) {
        this.name = name;
        this.model = model;
        this.id = id;
        this.price = price;
    }
    private String name;
    private String model;
    private String id;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
