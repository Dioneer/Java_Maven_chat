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
        System.out.println(arr);

    }
}
