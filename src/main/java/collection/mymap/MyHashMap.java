package collection.mymap;

import java.util.*;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> data = new HashMap<>();
        data.put(100, "Elena0");
        data.put(101, "Elena1");
        data.put(102, "Elena2");
        data.put(103, "Elena3");
        data.put(null, "Elena4");
        data.put(104, null);
//        data.putIfAbsent(100, "Elena0");
//        System.out.println(data);
//        System.out.println(data.get(103));
//        System.out.println(data.containsKey(100));
//        System.out.println(data.containsValue("Elena4"));
//        System.out.println(data.entrySet());
//        System.out.println(data.keySet());
//        System.out.println(data.values());
        /**
         *  another break in the wall
         */
        Student3 st1 = new Student3("Elena", "Gulkina", 3);
        Student3 st2 = new Student3("Elena", "Gulkina", 4);
        Student3 st3 = new Student3("Elena", "Gulkina", 5);
        Student3 st4 = new Student3("Elena", "Gulkina", 5);
        Map<Student3, Double> map= new HashMap<>();
        map.put(st1, 3.0);
        map.put(st2, 4.4);
        map.put(st3, 5.5);
        System.out.println(map);
        System.out.println(map.get(st4));
//        for (Map.Entry<Integer, String> items: data.entrySet()){
//            System.out.println(items.getKey()+" : "+items.getValue());
//        }
        List<Map.Entry<Student3, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        System.out.println(list);
    }
}
class Student3 implements Comparable<Student3>{
    String name;
    String surname;
    Integer course;

    public Student3(String name, String surname, Integer  course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return course == student3.course && Objects.equals(name, student3.name) && Objects.equals(surname, student3.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student3 o) {
        int result = this.name.compareTo(o.name);
        if(result == 0){
            result = this.surname.compareTo(o.surname);
            if(result==0){
                result = this.course.compareTo(o.course);
            }
        }
        return result;
    }
}