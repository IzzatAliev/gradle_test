package ua.com.alevel.stream;

import java.util.*;


public class SimpleStream {

    public List<Integer> list = new ArrayList<>();

    public void delete(int index){
        list.remove(index);
    }

    public void add() {
        Random random = new Random();
        for (int i = 1; i < 150; i++) {
            list.add(random.nextInt(1, 299));
        }
    }

    public void something() {
        list.stream()
                .filter(p -> p >= 10 && p <= 50)
                .distinct()
                .map(p -> p*5).forEach(System.out::println);
    }

    public void sum() {
        int result = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("result = " + result);
    }

    public void sortAsc() {
//        List<Integer> result = list.stream().sorted(Comparator.comparingInt(p -> p)).toList();
//        TreeSet<Integer> treeSet = new TreeSet<>(list);
//        List<Integer> result =new ArrayList<>(treeSet);
        List<Integer> result = list.stream().sorted().toList();
        System.out.println("result asc = " + result);
    }

    public void sortDesc() {
        List<Integer> result = list.stream().sorted((p, k) -> k - p).toList();
        System.out.println("result desc = " + result);
    }

    public void summary(){
        System.out.println(list.stream().reduce(Integer::sum));
    }
}
