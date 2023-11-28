package collection;

import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.firstElement());
        System.out.println(arr.lastElement());
    }
}
