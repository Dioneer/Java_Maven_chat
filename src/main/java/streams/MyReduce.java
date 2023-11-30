package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MyReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        int result = list.stream().reduce(Integer::sum).get();
        Optional<Integer> o = list.stream().reduce((acc, i)-> (acc+1)*i);
        if(o.isPresent()){
            System.out.println(o.get());
        }
        System.out.println(result);
        List<String> arr = new ArrayList<>();
        arr.add("Hi");
        arr.add("By");
        arr.add("Ok");
        arr.add("How");
        String st = arr.stream().reduce((acc, i)-> acc+ " " + i).get();
        System.out.println(st);
    }
}
