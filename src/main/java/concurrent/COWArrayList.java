package concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayList {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<>();
        arr.add("Zaur");
        arr.add("Oleg");
        arr.add("Ira");
        arr.add("Mira");
        System.out.println(arr);
        Runnable runnable1 = () ->{
            Iterator<String> iterator = arr.iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        };
        Runnable runnable2 = () ->{
            Iterator<String> iterator = arr.iterator();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                arr.remove(2);
                arr.add("Kira");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(arr);
    }
}
