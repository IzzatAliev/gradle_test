package ua.com.alevel.ma12.java.entity;

public class Car {

    int wheels = 4;
    int door =4;
    int windows =6;
    String name;
    String model;
    double price;
    int speed;

    public Car(){

    }

    public Car(String name, String model, double price, int speed){
        this.name = name;
        this.model = model;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", door=" + door +
                ", windows=" + windows +
                ", name='" + name + '\'' +
                ", mark='" + model + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
