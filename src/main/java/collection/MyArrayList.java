package collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyArrayList {
    public static void main(String[] args) {
        Integer[]arr = new Integer[5];
        int[]arr2 = new int[5];
        Arrays.fill(arr,2,4, 25);
        Arrays.fill(arr2,1);
//        int[] arr2 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Zaur");
        arrayList.add("Zaur");
//        System.out.println(arrayList);
        /**
         * mistake
         */
//        List<Integer> arr8 = Arrays.asList(1,2,5,6,4);
//        System.out.println("Arr8" + arr8);
//        arr8.add(5);
//        System.out.println("Arr8.1" + arr8);
        /**
         * different ways of fill
         */
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
        List<Integer> arrayList3 = Stream.of(arr).collect(Collectors.toList());
        List<Integer> arrayList4 = new ArrayList<>(Arrays.asList(arr));
        arrayList4.add(6);
        List<Integer> arrayList5 = Stream.of(arr).collect(Collectors.toList());
        arrayList5.add(6);
        List<Integer> arrayList6 = new ArrayList<>(Arrays.stream(arr2).boxed().toList());
        arrayList5.removeAll(arrayList4);
//        System.out.println(arrayList2);
//        System.out.println(arrayList==arrayList2);
//        System.out.println(arrayList.containsAll(arrayList2));
//        System.out.println(arrayList3);
        System.out.println(arrayList4);
        System.out.println(arrayList5);
        arrayList6.add(6);
//        System.out.print(arrayList6);
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
//        System.out.println(arrayList.equals(arrayList2));
//        if(arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)){
//            System.out.println(true);
//        }
//        for (Integer item: arrayList6){
//            System.out.print(item);
//        }
//        Iterator<Integer> iterator = arrayList6.iterator();
//        int i = 0;
//        while (iterator.hasNext()){
//            if(i == 3) {
//                iterator.remove();
//            }
//            iterator.next();
//            i++;
//        }
//        for (int i = 0; i < arrayList6.size(); i++) {
//            if(arrayList6.get(i) ==6){
//                arrayList6.remove(i);
//            }
//        }
//        arrayList6.set(0, 8);
//        arrayList6.remove(1);
//        System.out.print(arrayList6);
//        System.out.println(arrayList6.get(arrayList6.size()-1));
        Students men1 = new Students(25,2,"Igor", "Kromvel");
        Students men2 = new Students(26,2,"Igor", "Kromvel");
        Students men3 = new Students(27,2,"Igor", "Kromvel");
        Students men4 = new Students(28,2,"Igor", "Kromvel");
        ArrayList<Students> students = new ArrayList<>();
        students.add(men1);
        students.add(men2);
        students.add(men3);
        students.add(men4);
//        System.out.println(students);
/**
 * при таком удалении обязательно нужно переписывать сравнение
 */
        Students men5 = (new Students(28,2,"Igor", "Kromvel"));
//        students.remove(men5);
//        System.out.println(students);
        /**
         * indexOf при таком поиске обязательно нужно переписывать сравнение
         */
        System.out.println(students.indexOf(men5));
        /**
         * sublist
         */
//        List<Students> arr6 = students.subList(1,3);
//        System.out.println(arr6);
//        arr6.add(new Students(29,2,"Igor", "Kromvel"));
//        System.out.println(arr6 +" "+students);
        List<Students> arr7 = new ArrayList<>(students.subList(1,3));
        System.out.println(arr7);
        arr7.add(new Students(29,2,"Igor", "Kromvel"));
        System.out.println(arr7 +"==================="+students);
//        ===============================================================================================
        arrayList3.addAll(arrayList4);
//        System.out.println(arrayList3 + "Merge");
        /**
         * not modify and not null
         */
        List<Integer> listof = List.of(3,2,8);
        List<Integer> aslist = List.copyOf(listof);
    }
}
class Students{
    int age;
    int grade;
    String name;
    String surName;

    public Students(int age, int grade, String name, String surName) {
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && grade == students.grade && Objects.equals(name, students.name) && Objects.equals(surName, students.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, grade, name, surName);
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}