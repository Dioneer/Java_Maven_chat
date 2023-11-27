package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Aliya");
        arrayList.add("Rima");
        arrayList.add("Dima");
        arrayList.add("Prima");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
