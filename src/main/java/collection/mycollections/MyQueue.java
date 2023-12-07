package collection.mycollections;

public interface MyQueue<T>{
    void add(T value);
    T remove();
    boolean isEmpty();
}
