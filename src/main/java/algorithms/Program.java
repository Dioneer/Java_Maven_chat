package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Program {
    public static void main(String[] args) {
        /**
         * sum from 1 to N
         */
        ArrayList<Integer>arr = new ArrayList<>();
        AtomicInteger counter = new AtomicInteger();
        System.out.println(sumInt(5, counter, arr));
        System.out.println(counter);
        System.out.println(arr);
        ArrayList<Integer>arr2 = new ArrayList<>(findSimpleNumder(25));
        System.out.println(arr2);
    }
    public static int sumInt(int lastNum, AtomicInteger counter, ArrayList<Integer>arr){
        int sum = 0;
        for (int i = 1; i < lastNum+1; i++) {
            sum+=i;
            counter.getAndIncrement();
            arr.add(i);
        }
        return sum;
    }
    public static List<Integer> findSimpleNumder(int to){
        List<Integer> finds = new ArrayList<>();
        for (int i= 0; i <= to; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    flag = false;
                }
            }
            if(flag){
                finds.add(i);
            }
        }
        return finds;
    }
}
