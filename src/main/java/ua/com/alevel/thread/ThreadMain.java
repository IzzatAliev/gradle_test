package ua.com.alevel.thread;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadMain {

    static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {

    }


    public int sum(int a, int b) {
        return a + b;
    }

    public int randomSum(int count) {
        Random random = new Random();
        int sum = 0;
        for (int i = random.nextInt(1, count); i < count; i++) {
            sum += i;
        }
        return sum;
    }

    static class Runnabler implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                System.out.println();
            }
        }
    }

    static class Callabler implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            Integer sum = 0;
            for (int i = 1; i < 6; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
