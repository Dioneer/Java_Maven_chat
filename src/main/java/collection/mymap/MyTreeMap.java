package collection.mymap;

import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<Double, Student3> treeMap = new TreeMap<>();
        Student3 st1 = new Student3("Igor", "Karkarov", 3);
        Student3 st2 = new Student3("Igor", "Karkarov", 4);
        Student3 st3 = new Student3("Igor", "Karkarov", 5);
        Student3 st4 = new Student3("Igor", "Karkarov", 6);
        Student3 st5 = new Student3("Igor", "Karkarov", 7);
        Student3 st6 = new Student3("Igor", "Karkarov", 8);
        Student3 st7 = new Student3("Igor", "Karkarov", 9);
        treeMap.put(1.2, st1);
        treeMap.put(2.2, st2);
        treeMap.put(4.2, st4);
        treeMap.put(5.2, st5);
        treeMap.put(6.2, st6);
        treeMap.put(7.2, st7);
        treeMap.put(3.2, st3);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
    }
}
