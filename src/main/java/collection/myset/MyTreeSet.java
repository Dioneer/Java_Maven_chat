package collection.myset;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class MyTreeSet {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        /**
         * not null inside
         */
        TreeSet<Student> ts1= new TreeSet<>();
        Student st1 = new Student("Elena", 2);
        Student st2 = new Student("Elena", 3);
        Student st3 = new Student("Elena", 4);
        Student st4 = new Student("Elena", 5);
        ts1.add(st1);ts1.add(st2);ts1.add(st3);ts1.add(st4);
        System.out.println(ts1);
    }
}
class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int res = this.name.compareTo(o.name);
        if(res==0){
            res = this.course-o.course;
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}