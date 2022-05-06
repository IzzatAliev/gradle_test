package ua.com.alevel.thread;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadMain {

    static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
            Callabler callabler = new Callabler();
        System.out.println(executorService.submit(callabler).get().intValue());
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }

    public void sum(){
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
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
            for (int i = 1; i < 345654; i++) {
                System.out.println();
            }
        }
    }

    static class Callabler implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            Integer sum = 0;
            for (int i = 1; i < 345643; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
