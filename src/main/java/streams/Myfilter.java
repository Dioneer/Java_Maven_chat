package streams;

import java.util.ArrayList;
import java.util.List;

public class Myfilter {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22);
        Student st2 = new Student("Elena", 'f', 23);
        Student st3 = new Student("Ivann", 'm', 24);
        Student st4 = new Student("Olga", 'f', 25);
        Student st5 = new Student("Ivaan", 'm', 26);
        List<Student> st = new ArrayList<>();
        st.add(st1);st.add(st2);st.add(st3);st.add(st4);st.add(st5);
        st.stream().filter(i-> i.getAge()>22 && i.getSex()=='m').forEach(System.out::println);
    }
}
class Student{
    private String name;
    private char sex;
    private int age;

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

