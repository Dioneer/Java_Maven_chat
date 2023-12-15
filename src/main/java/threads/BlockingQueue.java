package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingQueue {
    List<Items>tasks = new ArrayList<>();
    public synchronized Items get() {
        while (tasks.isEmpty()){
            try {
                wait();
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
        return tasks.remove(0);
    }
    public synchronized void put(Items item) {
        tasks.add(item);
        notify();
    }
}
class Items implements Runnable{
    private int count;
    public Items(int i) {
        this.count = i;
    }
    @Override
    public void run() {
        System.out.println("Task "+ count+" start");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Task "+ count+" end");
    }
}
class Main{
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        BlockingQueue bq = new BlockingQueue();
        for (int i = 0; i < 7; i++) {
            bq.put(new Items(i));
        }
        while (true) {
            pool.submit(bq.get());
        }
    }
}