package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyFlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22);
        Student st2 = new Student("Elena", 'f', 23);
        Student st3 = new Student("Ivann", 'm', 24);
        Student st4 = new Student("Olga", 'f', 25);
        Student st5 = new Student("Ivaan", 'm', 26);
        Facultet facultet1 = new Facultet("Economics");
        Facultet facultet2 = new Facultet("Applied");
        facultet1.getStudentsOnFacultet().add(st1);
        facultet1.getStudentsOnFacultet().add(st2);
        facultet2.getStudentsOnFacultet().add(st3);
        facultet2.getStudentsOnFacultet().add(st4);
        facultet2.getStudentsOnFacultet().add(st5);
        List<Facultet> facultets = new ArrayList<>();
        facultets.add(facultet1);
        facultets.add(facultet2);
        List<String> arr = facultets.stream().flatMap(i->i.getStudentsOnFacultet().stream().map(Student::getName)).toList();
        System.out.println(arr);
    }
}

class Facultet{
   private final String name;
   private List<Student> studentsOnFacultet;

    public Facultet(String name) {
        this.name = name;
        if(studentsOnFacultet == null){
            studentsOnFacultet = new ArrayList<>();
        }
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsOnFacultet() {
        return studentsOnFacultet;
    }
}