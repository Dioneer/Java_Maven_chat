package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree1 {
    public static void main(String[] args) {
        NewTree<Integer> root = new NewTree<>(20, new NewTree<>(7, new NewTree<>(4, null,
                new NewTree<>(6)), new NewTree<>(9)), new NewTree<>(35,
                new NewTree<>(31, new NewTree<>(28), null),
                new NewTree<>(40, new NewTree<>(38), new NewTree<>(52))));
//        System.out.println(root.deepSum(root));
        System.out.println(root.wideSum(root));
    }
}

class NewTree<K>{
    K value;
    NewTree<K> left;
    NewTree<K> right;

    public NewTree(K value, NewTree<K> left, NewTree<K> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public NewTree(K value) {
        this.value = value;
    }

    public int deepSum(NewTree<K> root){
        int sum = (int) root.value;
        if(root.left != null){
            sum += deepSum(root.left);
        }
        if(root.right != null){
            sum += deepSum(root.right);
        }
        return sum;
    }
    public int wideSum(NewTree<K> root) {
        List<NewTree<K>> arr = new ArrayList<>();
        arr.add(root);
        int sum = 0;
        while (!arr.isEmpty()){
            NewTree<K> node= arr.remove(0);
            sum += (int) node.value;
            if(node.left!=null){
                arr.add(node.left);
            }
            if(node.right!=null){
                arr.add(node.right);
            }
        }
        return sum;
    }
}
