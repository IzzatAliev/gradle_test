package ua.com.alevel.insider;

import java.util.*;

public class InsiderMain {

    public static void main(String[] args) {
        HashMap<String, Car> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap.put("i" + i, new Car("car" + 1, 50 + 1, TypeCar.PICKUP));
            System.out.println("hashMap.get(\"i\"+i).hashCode() = " + hashMap.get("i" + i).hashCode());
        }
        System.out.println("hashMap = " + hashMap);
        System.out.println("hashMap.size() = " + hashMap.size());
        Set<String> set = hashMap.keySet();
        System.out.println("set = " + set);
        Collection<Car> list = hashMap.values();
        System.out.println("list = " + list);
        System.out.println("hashMap.merge(\"i1\", new Car(\"a\", 44, TypeCar.SEDAN), (x,y)->x) = " + hashMap.merge("i1", new Car("a", 44, TypeCar.SEDAN), (x, y) -> y));
        Map<String, Car> map = Collections.singletonMap("1", new Car("subaru", 100, TypeCar.SUPERCAR));
        System.out.println("map = " + map);
    }
}
