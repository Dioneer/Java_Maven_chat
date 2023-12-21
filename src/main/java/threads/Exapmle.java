package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Exapmle {
    public static void main(String[] args) {
        BlockingQueue1 blockingQueue1 = new BlockingQueue1();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        blockingQueue1.put(new Items1());
        blockingQueue1.put(new Items1());
        blockingQueue1.put(new Items1());
        blockingQueue1.put(new Items1());
        blockingQueue1.put(new Items1());
        while (true){
            pool.submit(()->blockingQueue1.get().run());
        }
    }
}
class BlockingQueue1{
    List<Items1> arr = new ArrayList<>();
    public synchronized Items1 get(){
        while (arr.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return arr.remove(0);
    }
    public synchronized void put(Items1 item){
        arr.add(item);
        notify();
    }
}
class Items1 implements Runnable{
    private final AtomicInteger count = new AtomicInteger();
    @Override
    public void run() {
        System.out.println("Task "+ count.getAndIncrement()+" start");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Task "+ count+" end");
    }
}