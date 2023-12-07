package collection.mycollections;

import java.util.ArrayList;

public class SimpleQueue<T> implements MyQueue<T>{
    ArrayList<T> arr = new ArrayList<>();
    @Override
    public void add(T value) {
        arr.add(value);
    }

    @Override
    public T remove() {
        T result = null;
        if(!arr.isEmpty()){
            result = arr.remove(0);
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }
}
