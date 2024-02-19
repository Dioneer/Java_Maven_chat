package Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> arr = new LinkedList<>();
        arr.removeIf((item)->item==8);
        Collections.addAll(arr, array);
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            if(iterator.next()==2){
                iterator.remove();
            }
        }
        System.out.println(arr);

        for(int i: Rang.fromTo(5,20)){
            System.out.println(i);
        }
        /**
         * палиндром
         */
        String s= "maam";
        List<Character>arr2 = s.chars().mapToObj(i->(char)i).toList();
        List<Character> arr3 = new LinkedList<>(arr2);
        System.out.println(arr3);
        ListIterator<Character> listIterator = arr3.listIterator(0);
        ListIterator<Character> prev = arr3.listIterator(arr3.size());
        while(listIterator.hasNext()){
            if (!listIterator.next().equals(prev.previous())) {
                System.out.println("false");
                }
        }
        System.out.println("true");
    }
}

class Rang implements Iterable<Integer>{
    int start;
    int end;
    public static Rang fromTo(int start, int end){
       return new Rang(start, end);
    };
    private Rang(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(start);
    }

    class MyIterator implements Iterator<Integer> {
        int start;

        public MyIterator(int start) {
            this.start = start;
        }

        @Override
        public boolean hasNext() {
            return start<=end;
        }

        @Override
        public Integer next() {
            return start++;
        }
    }
}
