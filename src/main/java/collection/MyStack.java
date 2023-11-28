package collection;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> arr = new Stack<>();
        arr.push("Zaur");
        arr.push("Misha");
        arr.push("Oleg");
        arr.push("Katya");
        System.out.println(arr);
        System.out.println("Peek - "+arr.peek());
        while (!arr.isEmpty()){
            String item = arr.pop();
            System.out.println(item);
        }
        System.out.println(arr);
    }
}
