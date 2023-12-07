package algorithms.myLinkedOneLink;

public class TestLinkedList<T> {
    Node head;
    public class Node{
        Node next;
        T value;
    }
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if(head!=null){
            node.next = head;
        }
        head = node;
    }
    public void addLast(T value){
        Node node = new Node();
        if(head==null){
            head=node;
        }else{
            Node last = head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = node;
        }
    }
    public void removeFirst(){
        if(head != null){
            head = head.next;
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
    public Node contains(T values){
        Node node = head;
        while(node != null){
            if(node.value.equals(values)){
                return node;
            }
            node = node.next;
        }
        return node;
    }
    public void sort(MyCompare comparator){
        Node node =head;
        while (node != null){
            Node min = node;
            Node min2 = node.next;
            while (min2 != null){
                if(comparator.compare((Employee)min.value, (Employee)min2.value)>0){
                    min = min2;
                }
                min2 = min2.next;
            }
            if(min != node){
                T buff = node.value;
                node.value = min.value;
                min.value = buff;
            }
            node = node.next;

        }
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
