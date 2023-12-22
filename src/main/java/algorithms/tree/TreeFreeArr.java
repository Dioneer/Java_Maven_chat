package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeFreeArr<T, N extends TreeFreeArr<T, N>> {
    N parent;
    ArrayList<N> children;
    T data;

    public TreeFreeArr(N parent, ArrayList<N> children, T data) {
        this.parent = parent;
        this.children = children;
        this.data = data;
    }
    public TreeFreeArr() {}

//    public static <T, N extends TreeFreeArr<T, N>> N makeTree(List<T> datas, TypeAdapter<T,N> typeAdapter){
//        N root = typeAdapter.newInstance();
//        root.children = new ArrayList<>();
//
//    }

}
class Main{
    public static void main(String[] args) {
        ArrayList<Data> items = new ArrayList<>();
        items.add(new Data(1,"Juice",0));
        items.add(new Data(2,"Mango",1));
        items.add(new Data(3,"Grapes",1));
        items.add(new Data(4,"Apple",1));
        items.add(new Data(5,"Gaz",0));
        items.add(new Data(6,"Cola",5));
        items.add(new Data(7,"Cola 0.5",6));
        items.add(new Data(8,"Cola 1.5",6));
        items.add(new Data(9,"Mineralka",5));
        items.add(new Data(10,"Fresh",5));

    }
}
class Data{
    int id;
    String name;
    int parentId;

    public Data(int id, String name, int parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }
}
