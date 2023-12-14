package streams;

import algorithms.SortUtils;

import java.util.*;

public class MySorted {
    public static void main(String[] args) {
        int[] arr = {3,8,4,1,2,5,6,4,110};
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
//        st.stream().filter(i->i.getSex()=='f').sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);
//        long res = Arrays.stream(arr).filter(i->i>0).count();
//        System.out.println(res);
        Collection collection = Arrays.asList("a1","a12","a3","a1","a13");
        System.out.println(collection.stream().filter("a1"::equals).count());
        System.out.println(collection.stream().findFirst().orElse(0));
        System.out.println(collection.stream().findFirst().orElse(0));
        System.out.println(collection.stream().skip(collection.size() - 1).findFirst().orElse("Empty"));
        System.out.println(collection.stream().skip(collection.size() - 1).findFirst().orElse("Empty"));
    }
}
