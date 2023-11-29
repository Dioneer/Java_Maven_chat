package lambda;

import java.util.ArrayList;

public class LambdaPOne {
    public static void main(String[] args) {
        Students st1  = new Students("Ivan", 'm', 22);
        Students st2  = new Students("Marina", 'f', 23);
        Students st3  = new Students("Igor", 'm', 24);
        Students st4 = new Students("Olya", 'f', 25);
        ArrayList<Students> stall = new ArrayList<>();
        stall.add(st1);
        stall.add(st2);
        stall.add(st3);
        stall.add(st4);
//        OverAge(stall,23);
//        OverAgeAndSex(stall,23, 'm');
        studentCheck(stall, s -> s.age > 23);
    }
    private static void studentCheck(ArrayList<Students> all, FilterConditions fc){
        for (Students i: all){
           if(fc.check(i)){
                System.out.println(i);
            }
        }
    }
//    private static void OverAge(ArrayList<Students> al, int age){
//        for (Students s: al){
//            if(s.age>age){
//                System.out.println(s);
//            }
//        }
//    }
//    private static void OverAgeAndSex(ArrayList<Students> al, int age, char sex){
//        for (Students s: al){
//            if(s.age>age&&s.sex==sex){
//                System.out.println(s);
//            }
//        }
//    }

}
class Students{
    String name;
    char sex;
    int age;

    public Students(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}