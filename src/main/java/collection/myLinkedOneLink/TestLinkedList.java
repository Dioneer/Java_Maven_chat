package collection.myLinkedOneLink;

public class TestLinkedList<T> {
    Node head;
    public class Node{
        T value;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
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
        }else{
            Node last = head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = node;
        }
    }
    public void removeLast(){
        Node last = head;
        if(head != null) {
            while (last.next != null) {
                if (last.next.next == null) {
                    last.next = null;
                    return;
                }
                last = last.next;
            }
        }
        head=null;
    }
    public void removeFirst(){
        Node node = head;
        if(node!=null){
            node = head.next;
        }
    }
    public Node contains(T values){
        Node node = head;
        while (node != null){
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
        Node tempo;
        Node prev = null;
        while (node != null){
            tempo = node.next;
            node.next = prev;
            prev = node;
            node = tempo;
        }
        head = prev;
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
