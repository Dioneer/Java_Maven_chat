package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MySynchro {
    private static AtomicInteger counter = new AtomicInteger();

    public AtomicInteger getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
//        for (int i = 0; i < 6; i++) {
//            pool.submit(test1());
//            Thread.sleep(1000);
//        }
        pool.shutdown();
        Runnable runnable = new Runnable() {
            synchronized public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread th1 = new Thread(runnable);
        th1.start();
        Thread th2 = new Thread(runnable);
        th2.start();
        Thread th3 = new Thread(runnable);
        th3.start();
    }
    public static Runnable test1(){
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + " Counter " + counter.getAndIncrement());
        return runnable;
    };
}
