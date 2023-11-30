package concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CCHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"Elena");
        map.put(2,"Oleg");
        map.put(3,"Ivan");
        map.put(6,"Elena");
        Runnable run1 = ()->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i);
            }
        };
        Runnable run2 = ()->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(320);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                map.put(7,"Mila");
            }
        };
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
//        for (Map.Entry<Integer, String> i: map.entrySet()){
//            System.out.println(i);
//        }
//        System.out.println(map.keySet());
    }
}
