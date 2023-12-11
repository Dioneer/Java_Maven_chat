package collection.myLinkedOneLink;

public class Program {
    public static void main(String[] args) {
        MyLinkedList<Employee> list = new MyLinkedList<>();
        TestLinkedList<Employee> list2 = new TestLinkedList<>();
        Employee employee1 = new Employee("Mira", 23);
        Employee employee2 = new Employee("Mirra", 32);
        Employee employee3 = new Employee("Mirrra", 43);
        Employee employee4 = new Employee("Miraa", 23);
        Employee employee5 = new Employee("Miira", 22);
        list.addFirst(employee1);list.addFirst(employee2);list.addFirst(employee3);list.addFirst(employee4);list.addFirst(employee5);
        list2.addFirst(employee1);list2.addFirst(employee2);list2.addFirst(employee3);list2.addFirst(employee4);list2.addFirst(employee5);
//        ==========================================================================
        System.out.println(list);
        System.out.println("Find: " +  list.contains(employee2));
        list.sort(new MyCompare(SortType.ASCENDING));
        System.out.println("=========================================================");
        System.out.println(list2);
        System.out.println("Find: " +  list2.contains(employee1));
        list2.sort(new MyCompare(SortType.ASCENDING));
    }
}
