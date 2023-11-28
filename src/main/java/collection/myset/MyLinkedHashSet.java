package collection.myset;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(8);
        lhs.add(53);
        lhs.add(2);
        lhs.remove(5);
        System.out.println(lhs);

    }
}
