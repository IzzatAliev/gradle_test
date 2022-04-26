package ua.com.alevel.insider;

public enum TypeCar {

    MICRO("Micro"), SEDAN("Sedan"),
    SUPERCAR("Supercar"), PICKUP("Pickup");

    public final String type;

    TypeCar(String type) {
        this.type = type;
    }
}
