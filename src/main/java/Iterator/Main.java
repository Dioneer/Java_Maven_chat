package Iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
    }
}
class Rang implements Iterable<Integer>{
    int start;
    int end;
    public static Rang fromTo(int from, int to){
        return new Rang(from,to);
    }
    private Rang(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(start);
    }
    class Iterator implements java.util.Iterator<Integer>{
        int current;

        public Iterator(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current<=end;

        }

        @Override
        public Integer next() {
            return current++;
        }
    }
}
