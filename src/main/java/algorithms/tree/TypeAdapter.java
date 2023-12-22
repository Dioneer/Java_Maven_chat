package algorithms.tree;

public interface TypeAdapter<T,N> {
    N newInstance();
    boolean isChildOf(T parentNodeData, T childNodeData);
    boolean isRoot(T data);
}
