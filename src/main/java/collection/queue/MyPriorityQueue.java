package collection.queue;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
     PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//     priorityQueue.add(1);
//     priorityQueue.add(2);
//     priorityQueue.add(3);
//     priorityQueue.add(4);
//        System.out.println(priorityQueue.peek());
      Student st1 = new Student("Elena", 2);
      Student st2 = new Student("Elena", 3);
      Student st3 = new Student("Elena", 4);
      Student st4 = new Student("Elena", 5);
      PriorityQueue<Student> priorityQueue1 = new PriorityQueue<>();
      priorityQueue1.add(st1);
      priorityQueue1.add(st2);
      priorityQueue1.add(st3);
      priorityQueue1.add(st4);
        System.out.println(priorityQueue1);
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
}