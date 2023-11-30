package concurrent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ABlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arr = new ArrayBlockingQueue<>(4);
//        arr.add(5);
//        arr.add(55);
//        arr.add(56);
//        arr.add(76);
//        arr.offer(66);
//        System.out.println(arr);
        Runnable run1= () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    arr.put(i);
                    System.out.println("Creater put: "+ i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Runnable run2 = () -> {
            while (true) {
                try {
                    Integer j = arr.take();
                    System.out.println("Consumer take: "+ j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread tr1 = new Thread(run1);
        Thread tr2 = new Thread(run2);
        tr1.start();
        tr2.start();
    }
}
