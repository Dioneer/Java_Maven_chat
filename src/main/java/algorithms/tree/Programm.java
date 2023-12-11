package algorithms.tree;

import java.util.*;

public class Programm {
    public static void main(String[] args) {
        Tree root = new Tree(20, new Tree(7, new Tree(4, null, new Tree(6)),new Tree(9)),
                new Tree(35, new Tree(31, new Tree(28),null),new Tree(40, new Tree(38), new Tree(52))));
        System.out.println(Tree.sum(root));
        System.out.println(Tree.wildSum(root));
    }
}
class Tree{
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }
    public static int sum(Tree root){
        int sum = root.value;
        if(root.left != null){
            sum+=sum(root.left);
        }
        if(root.right != null){
            sum+=sum(root.right);
        }
        return sum;
    }
    public static int wildSum(Tree root){
        List<Tree>arr = new Stack<>();
        arr.add(root);
        int sum = 0;
        while(!arr.isEmpty()){
            Tree node = arr.remove(0);
            System.out.println(node.value);
            sum += node.value;
            if(node.right != null){
                arr.add(node.right);
            }
            if(node.left != null){
                arr.add(node.left);
            }
        }
        return sum;
    }
}