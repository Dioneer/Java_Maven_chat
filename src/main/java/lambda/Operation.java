package lambda;

public interface Operation<T, V> {
    T execute(V arr);
}
