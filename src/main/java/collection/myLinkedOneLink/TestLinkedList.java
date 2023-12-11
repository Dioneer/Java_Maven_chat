package collection.myLinkedOneLink;

public class TestLinkedList<T> {
   Node head;
   class Node{
       T value;
       Node next;

       @Override
       public String toString() {
           return "Node{" +
                   "value=" + value +
                   ", next=" + next +
                   '}';
       }
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
        node.value = value;
        if(head==null){
            head = node;
        }else{
            Node last = head;
            while (last.next!=null){
                last = last.next;
            }
            last.next = node;
        }
    }
    public void removeLast(){
        if(head!=null){
            Node last = head;
            while (last.next!=null){
                if(last.next.next==null){
                    last.next = null;
                    return;
                }
                last = last.next;
            }
        }
        head = null;
    }
    public void removeFirst(){
        if(head!=null) {
            head = head.next;
        }
    }
    public Node contains(T values){
       Node list = head;
       while (list !=null){
           if(list.value.equals(values)){
               return list;
           }
           list = list.next;
       }
       return null;
    }
    public void sort(MyCompare comparator){
        Node list = head;
        while (list !=null){
            Node min = list;
            Node second = list.next;
            while (second !=null){
                if(comparator.compare((Employee) min.value, (Employee) second.value)>0){
                    min = second;
                }
            }
            if(min != list){
                T buf = list.value;
                list.value = min.value;
                min.value = buf;
            }
            list = list.next;
        }
    }
    public void Reverse() {
       Node prev = null;
       Node node = head;
       Node temp;
        while (node !=null){
            temp = node.next;
            node.next = prev;
            prev = node;

            node = temp;
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
