package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedlistQu {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur1");
        queue.add("Zaur2");
        queue.add("Zaur3");
        queue.add("Zaur4");
        queue.offer("Zaur5");
        /**
         * without exception
         */
        System.out.println(queue.poll());
        System.out.println(queue.element());
        /**
         * without exception
         */
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
