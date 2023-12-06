package algorithms.myLinkedOneLink;

public class Program {
    public static void main(String[] args) {
        MyLinkedList<Employee> list = new MyLinkedList<>();
        Employee employee1 = new Employee("Mira", 23);
        Employee employee2 = new Employee("Mira", 32);
        Employee employee3 = new Employee("Mira", 43);
        Employee employee4 = new Employee("Mira", 23);
        Employee employee5 = new Employee("Mira", 22);
        list.addFirst(employee1);list.addFirst(employee2);list.addFirst(employee3);list.addFirst(employee4);list.addFirst(employee5);
        list.sort(new MyCompare(SortType.ASCENDING));
        System.out.println(list);
    }
}
