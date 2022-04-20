package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.numbers();
    }

    private void numbers(){
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
