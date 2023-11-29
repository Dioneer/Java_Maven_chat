package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MySynchro {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(14);
        /**
         * without synchro
         */
//        ArrayList<Integer> target = new ArrayList<>()
//        Runnable runnable= () -> target.addAll(source);
        /**
         * with synchro
         */
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
//        Runnable runnable= () -> synchList.addAll(source);
//        Thread thread1 = new Thread(runnable);
//        Thread thread2 = new Thread(runnable);
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(target);
//        System.out.println(synchList);
        /**
         * with mistake
         */
//        Runnable runnable1 = ()->{
//            Iterator<Integer> i = source.iterator();
//            while (i.hasNext()){
//                System.out.println(i.next());
//            }
//        };
//        Runnable runnable2 = ()->source.remove(1);
//        Thread thread1 = new Thread(runnable1);
//        Thread thread2 = new Thread(runnable2);
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
        /**
         * with synchro & without mistake
         */
       List<Integer> source1 = Collections.synchronizedList(new ArrayList<>());;
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(14);
        Runnable runnable1 = ()->{
            synchronized (synchList) {
                Iterator<Integer> i = source1.iterator();
                while (i.hasNext()) {
                    System.out.println(i.next());
                }
            }
        };
        Runnable runnable2 = ()-> {
            if(!source1.isEmpty()) {
                source1.remove(0);
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(source1);
    }
}
