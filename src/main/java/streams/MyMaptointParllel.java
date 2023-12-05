package streams;

import java.util.ArrayList;
import java.util.List;

public class MyMaptointParllel {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22);
        Student st2 = new Student("Elena", 'f', 23);
        Student st3 = new Student("Ivann", 'm', 24);
        Student st4 = new Student("Olga", 'f', 25);
        Student st5 = new Student("Ivaan", 'm', 26);
        List<Student> st = new ArrayList<>();
        st.add(st1);
        st.add(st2);
        st.add(st3);
        st.add(st4);
        st.add(st5);
        List<Integer> arr = st.stream().mapToInt(i->i.getAge()).boxed().toList();
        int sum =  st.stream().mapToInt(i->i.getAge()).sum();
        double avg =  st.stream().mapToInt(i->i.getAge()).average().getAsDouble();
        System.out.println(arr+"---"+sum+"---"+avg);

        List<Double> list = new ArrayList<>();
        list.add(10.0);list.add(11.0);list.add(12.0);list.add(13.0);list.add(14.0);
        double sumresult = list.stream().reduce(Double::sum).get();
        double sumresult2 = list.parallelStream().reduce(Double::sum).get();
        System.out.println("sumResult=" + sumresult);
        System.out.println("sumResult2=" + sumresult2);
    }
}
