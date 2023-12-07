package collection.mycollections;

import java.util.ArrayList;

public class SimpleStack<T> implements MyStack<T>{
    ArrayList<T> arr = new ArrayList<>();
    @Override
    public void add(T value) {
        arr.add(0,value);
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
        return false;
    }
}
