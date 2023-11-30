package streams;

import java.util.Arrays;

public class MyForeach {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}
class Utils{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("Element = "+a);
    }
}