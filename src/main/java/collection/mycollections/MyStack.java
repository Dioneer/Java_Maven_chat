package collection.mycollections;

public interface MyStack<T> {
    void add(T value);
    T remove();
    boolean isEmpty();
}
