package compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparation {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Zuar");
//        list.add("Ivan");
//        list.add("Mariya");
//        System.out.println("Before sort "+list);
//        Collections.reverse(list);
//        System.out.println("After sort "+list);
        List<Employee>arr = new ArrayList<>();
        Employee em1 = new Employee(100,100,"Ira");
        Employee em2 = new Employee(1000,100,"Ora");
        Employee em3 = new Employee(150,100,"Kara");
        Employee em4= new Employee(1050,100,"Ira");
        arr.add(em1);
        arr.add(em2);
        arr.add(em3);
        arr.add(em4);
        System.out.println("Before sort "+arr);
//        Collections.sort(arr, Comparator.comparing(o->o.name));
//        Collections.sort(arr);
        Collections.sort(arr, new MyComparator());
        System.out.println("After sort "+arr);
    }
}
class Employee implements Comparable<Employee>{
    int id;
    int salary;
    String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o2) {
        return this.id - o2.id;
    }
}