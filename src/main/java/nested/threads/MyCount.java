package nested.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCount implements Runnable {
    private int count;
    @Override
    public void run() {
        while (count<20){
            count++;
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
            System.out.println(Thread.currentThread().getName() + " " + count);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            Thread thread1 = new Thread(new MyCount());
            pool.submit(thread1);
        }
//        Thread thread1 = new Thread(new MyCount());
//        Thread thread2 = new Thread(new MyCount());
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
    }
}
