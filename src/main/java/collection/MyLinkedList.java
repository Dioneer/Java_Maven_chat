package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyLinkedList {
    public static void main(String[] args) {
        Student2 student21 = new Student2("Ivan", 5);
        Student2 student22 = new Student2("Petr", 2);
        Student2 student23 = new Student2("Pavel", 3);
        Student2 student24 = new Student2("Nik", 4);
        Student2 student25 = new Student2("Kriss", 5);
        List<Student2> arr = new LinkedList<>();
        arr.add(student21);
        arr.add(student22);
        arr.add(student23);
        arr.add(student24);
        arr.add(student25);
//        System.out.println(arr.get(2));
        Student2 student26 = new Student2("Kriss", 5);
        arr.add(1, new Student2("Miran", 5));
        arr.remove(student26);
        System.out.println(arr);
    }
}
class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
