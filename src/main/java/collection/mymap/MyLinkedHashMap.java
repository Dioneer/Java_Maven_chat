package collection.mymap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Student3, Double> linkMap = new LinkedHashMap<>(16,5,true);
        Student3 st1 = new Student3("Igor", "Karkarov", 3);
        Student3 st2 = new Student3("Igor", "Karkarov", 4);
        Student3 st3 = new Student3("Igor", "Karkarov", 5);
        Student3 st4 = new Student3("Igor", "Karkarov", 6);
        linkMap.put(st1, 5.8);
        linkMap.put(st2, 6.8);
        linkMap.put(null, null);
        linkMap.put(st4, 8.8);
        System.out.println(linkMap.containsValue(5.8));
        System.out.println(linkMap);

    }
}
