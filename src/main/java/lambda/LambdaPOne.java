package lambda;

import java.util.*;

public class LambdaPOne {
    public static void main(String[] args) {
        String[] arr = {"AS", "dasd", "asdasd", "zxczx"};
        Students st1  = new Students("Ivan", 'm', 22);
        Students st2  = new Students("Marina", 'f', 23);
        Students st3  = new Students("Igor", 'm', 24);
        Students st4 = new Students("Olya", 'f', 25);
        String[] arr2 = Arrays.stream(arr).sorted(String::compareTo).toArray(String[]::new);
        Arrays.stream(arr2).forEach(System.out::println);
        System.out.println(Arrays.toString(arr2));
        ArrayList<Students> stall = new ArrayList<>();
        stall.add(st1);
        stall.add(st2);
        stall.add(st3);
        stall.add(st4);
//        OverAge(stall,23);
//        OverAgeAndSex(stall,23, 'm');
        studentCheck(stall, s -> s.age > 23);
        List<Integer> lymbda = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            lymbda.add(random.nextInt(1,10));
        }
        System.out.println(action(lymbda).execute(lymbda));
//        new Thread(()-> System.out.println("Hello")).start();
    }
    private static Operation action(List<Integer> list){
        if (list.size() > 20){
            Operation<Integer, List<Integer>> operation = arr->{
                Integer sum = 0;
                for (Integer i : arr){
                    sum+=i;
                }
                return sum;
            };
            return operation;
        } else if (list.size() > 10) {
            Operation<String, List<Integer>> operation = arr->{
                String sum = "";
                for (Integer i : arr){
                    sum+=i;
                }
                return sum;
            };
            return operation;
        }
        return null;
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