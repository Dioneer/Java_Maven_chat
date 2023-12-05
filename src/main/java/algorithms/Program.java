package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Program {
    public static void main(String[] args) {
        /**
         * sum from 1 to N
         */
        ArrayList<Integer>arr = new ArrayList<>();
        AtomicInteger counter = new AtomicInteger();
//        System.out.println(sumInt(5, counter, arr));
//        System.out.println(counter);
//        System.out.println(arr);
//        ArrayList<Integer>arr2 = new ArrayList<>(findSimpleNumder(25));
//        System.out.println(arr2);
        System.out.println(fibo(8));
        System.out.println(fibo2(8));
        int[] array = {1,24,7,8,55,55,12,321,9};
        vibor(array);
        pusyr(array);
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
    public static int fibo(int i){
        if(i==2 ||i ==1) return 1;
        return fibo(i-2) + fibo(i-1);
    }
    public static void pusyr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void vibor(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int indMin = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[indMin] > arr[j]){
                    indMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indMin];
            arr[indMin] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int fibo2(int num){
        int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i-2]+arr[i-1];
        }
        return arr[arr.length-1];
    }
}
