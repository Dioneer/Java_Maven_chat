package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyBinSearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        int[] arr3 = {1,2,3,4,5};
        int[]arr4 = new int[arr3.length];
        System.arraycopy(arr3, 0, arr4, 0, arr3.length);
        System.out.println(Arrays.toString(arr4));
//        int index = search(12, arr);
//        System.out.println(index);
        Employee employee1 = new Employee(5, "Ira", 25);
        Employee employee2 = new Employee(5, "Ira", 2350);
        Employee employee3 = new Employee(5, "Ira", 2500);
        Employee employee4 = new Employee(5, "Ira", 250);
        ArrayList<Employee> arr2 = new ArrayList<>();
        arr2.add(employee1);arr2.add(employee2);arr2.add(employee3);arr2.add(employee4);
        System.out.println(Collections.binarySearch(arr, 11));
        Collections.sort(arr2);
        System.out.println("Index: " +Collections.binarySearch(arr2, employee4));
        System.out.println(arr2);
    }
    public static int search(int item, ArrayList<Integer> arr){
        int index=-1;
        int min = 0;
        int max = arr.size()-1;
        while (min <= max){
            int middle = (int) Math.floor((min+max)/2);
            if(item == arr.get(middle)){
                index = arr.indexOf(item);
                return index;
            }
            if(item<arr.get(middle)){
                max = middle-1;
            }
            if(item>arr.get(middle)){
                min = middle+1;
            }
        }
        return index;
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    Integer salary;

    public Employee(int id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary.compareTo(o.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}