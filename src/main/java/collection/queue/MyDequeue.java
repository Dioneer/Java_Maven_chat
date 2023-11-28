package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDequeue {
    public static void main(String[] args) {
        Deque<Integer> qrr= new ArrayDeque<>();
        qrr.addFirst(3);
        qrr.addFirst(5);
        qrr.offerFirst(8);
        qrr.addLast(5);
        qrr.addLast(4);
        System.out.println(qrr);
    }
}
