package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyColletG {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22);
        Student st2 = new Student("Elena", 'f', 23);
        Student st3 = new Student("Ivann", 'm', 24);
        Student st4 = new Student("Olga", 'f', 25);
        Student st5 = new Student("Ivaan", 'm', 26);
        List<Student> st = new ArrayList<>();
        st.add(st1);st.add(st2);st.add(st3);st.add(st4);st.add(st5);
//        Map<Integer,List<Student>> map = st.stream().map(i-> {i.setName(i.getName().toUpperCase()); return i;}).collect(Collectors.groupingBy(i->i.getAge()));
//        for (Map.Entry<Integer,List<Student>> item: map.entrySet()){
//            System.out.println(item);
//        }
        Map<Boolean,List<Student>> map = st.stream().collect(Collectors.partitioningBy(i->i.getSex()=='m'));
        for (Map.Entry<Boolean,List<Student>> item: map.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
