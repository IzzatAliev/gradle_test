package ua.com.alevel.car;

import java.util.List;

public class CarStore {

    private static List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        CarStore.cars = cars;
    }

    @Override
    public String toString() {
        return "CarStore{" +
                "cars=" + cars + '}';
    }
}
