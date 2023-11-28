package collection.myset;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Kirra");
//        set.add("Kirraa");
//        set.add("Kirraaa");
//        set.add("Kirr");
//        for (String s:set){
//            System.out.println(s);
//        }
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        System.out.println(set.contains("Kirra"));
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(12);
        set1.add(3);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(7);
        set2.add(8);
        set2.add(2);
//        set1.addAll(set2);
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
