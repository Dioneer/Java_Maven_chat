package dataWork;

import org.w3c.dom.ls.LSOutput;

public class AllOfThem {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("Amount of seconds, that have passed since a 1 jan 1970: "+time);
        long nanoTime = System.nanoTime();
        System.out.println("Amount of seconds, that have passed since a certain moment: "+nanoTime );
        Long diff = measureTime(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(diff);
    }
    public static long measureTime(Runnable code){
        Long start = System.nanoTime();
        code.run();
        return System.nanoTime() - start;
    }
}
