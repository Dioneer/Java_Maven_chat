package streams;

import algorithms.SortUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MyConcutDistinct {
    public static void main(String[] args) {
//        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
//        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);
//        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
//        stream3.forEach(System.out::println);
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr1.add(i);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 5; i < 10; i++) {
            arr2.add(i);
        }
        Stream<Integer> stream3 = Stream.concat(arr1.stream(), arr2.stream());
        List<Integer> arr3 = stream3.toList();
        System.out.println("Distinct - " + arr1.stream().distinct().count());
        System.out.println(arr3);
        arr3.stream().distinct().forEach(System.out::print);
    }
}
