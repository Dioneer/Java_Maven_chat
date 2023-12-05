package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyFindFirstMinMaxLimitSkip {
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
        Student stFind = st.stream().filter(i -> i.getSex() == 'f').findFirst().get();
//        System.out.println(stFind);
        Student min = st.stream().min(Comparator.comparingInt(Student::getAge)).get();
        Student max = st.stream().max(new MyComp()).get();
        System.out.println(min + " " + max);
        List<Student> limSt = st.stream().filter(i -> i.getAge() > 10).limit(2).toList();
        List<Student> limSt2 = st.stream().filter(i -> i.getAge() > 10).skip(2).toList();
        System.out.println(limSt);
        System.out.println(limSt2);
    }
}
class MyComp implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}