package collection.myLinkedOneLink;


public class MyLinkedList<T> {
    public Node head;
    public class Node{
        public Node next;
        public T value;

        @Override
        public String toString() {
            return "Node{"+"value=" + value + '}';
        }
    }
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if(head != null){
            node.next = head;
        }
        head = node;
    }
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
        } else{
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }

    }
    public void removeLast(){
        if(head != null) {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
        }
        head=null;
    }
    public void removeFirst(){
        if(head != null){
            head = head.next;
        }
    }
    public Node contains(T values){
        Node node = head;
        while(node != null){
            if(node.value.equals(values)){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void sort(MyCompare comparator){
        Node node = head;
        while (node != null){
            Node minValue = node;
            Node node2 = node.next;
            while (node2 != null){
                if(comparator.compare((Employee) minValue.value, (Employee) node2.value) > 0){
                    minValue = node2;
                }
                node2 = node2.next;
            }
            if(minValue != node){
                T buff = node.value;
                node.value = minValue.value;
                minValue.value = buff;
            }
            node = node.next;
        }
    }
    public void Reverse() {
        Node node = head;
        Node temp;
        Node prevNode = null;

        while (node != null) {
            temp = node.next;
            node.next = prevNode;
            prevNode = node;
            node = temp;
        }
        head = prevNode;
    }

        @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
