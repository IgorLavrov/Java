package ee.sda.javaee10.exercise37;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    static ExecutorService executor = Executors.newFixedThreadPool(2);

    static int counter = 0;

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            executor.execute(new ThreadPlaygroundRunnable("My Thread " + i));
        }

        System.out.println(executor.shutdownNow().size());
    }
}


class ThreadPlaygroundRunnable implements Runnable {

    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println((Main.counter++) + Thread.currentThread().getName() + " " + this.name + " " + i);
        }
    }
}