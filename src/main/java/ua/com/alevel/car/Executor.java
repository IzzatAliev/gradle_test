package ua.com.alevel;

import ua.com.alevel.car.Car;
import ua.com.alevel.car.CarStore;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Executor {

    public static final List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        CarStore carStore = new CarStore();
        Car bmw = new Car("Bmw", "m5", "1", 15000.00);
        Car audi = new Car("Audi", "m7", "2", 20000.00);
        Car mercedes = new Car("Mercedes", "m8", "3", 35000.00);
        cars.add(bmw);
        cars.add(audi);
        cars.add(mercedes);
        carStore.setCars(cars);
        for (Car car: carStore.getCars()) {
            System.out.println(car);
        }
        Executor executor = new Executor();
        System.out.println("cars");
        executor.sort(cars);
    }

    public void sort(List<Car> list){
        TreeSet<Car> carTreeSet = new TreeSet<>(list);
        System.out.println(new ArrayList<>(carTreeSet));
    }
}
