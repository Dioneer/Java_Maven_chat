package streams;

import java.util.*;

public class Mymap {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Hi");
        arr.add("By");
        arr.add("Ok");
        arr.add("How");
        List<Integer>l2 = arr.stream().map(String::length).toList();
        System.out.println(l2);
        int[] array = {1,2,3,4,5,6};
        List<Integer> arr2 = Arrays.stream(array).boxed().toList();
        System.out.println(arr2);

    }
}
