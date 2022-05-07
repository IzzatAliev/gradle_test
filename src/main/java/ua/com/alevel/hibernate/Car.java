package ua.com.alevel.hibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "cars", schema = "hibernate_public")
public class Car implements Comparable<Car> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String model;
    private Double price;

    public Car() {
    }

    public Car(String name, String model, Double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Car(Long id, String name, String model, Double price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.price = price;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public int compareTo(Car o) {
        return name.compareTo(o.name);
    }
}
