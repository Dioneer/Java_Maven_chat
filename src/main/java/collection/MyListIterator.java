package collection;

import java.util.*;
import java.util.stream.Collectors;

public class MyListIterator {
      public static void main(String[] args) {
        String s = "madam";
        List<Character> check = s.chars().mapToObj(i->(char)i).toList();
        ListIterator<Character> listIterator = check.listIterator();
        ListIterator<Character> listIterator1 = check.listIterator(check.size());
        boolean flag = true;
        while(listIterator1.hasPrevious() && listIterator.hasNext()){
            if(listIterator.next() !=listIterator1.previous() ) {
                flag = false;
            break;
            }
        }
        System.out.println(flag);
    }
}
