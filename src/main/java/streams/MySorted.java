package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MySorted {
    public static void main(String[] args) {
//        int[] arr = {3,8,4,1,2,5,6,4,110};
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));
        Student st1 = new Student("Ivan", 'm', 22);
        Student st2 = new Student("Elena", 'f', 23);
        Student st3 = new Student("Ivann", 'm', 24);
        Student st4 = new Student("Olga", 'f', 25);
        Student st5 = new Student("Ivaan", 'm', 26);
        List<Student> st = new ArrayList<>();
        st.add(st1);st.add(st2);st.add(st3);st.add(st4);st.add(st5);
//        st = st.stream().sorted(Comparator.comparingInt(o->o.getAge())).toList();
//        st = st.stream().sorted(Comparator.comparingInt(Student::getAge)).toList();
//        st = st.stream().sorted((x,y)-> x.getAge()-y.getAge()).toList();
//        System.out.println(st);
        st.stream().filter(i->i.getSex()=='f').sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);
    }
}
