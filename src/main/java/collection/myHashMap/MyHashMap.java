package collection.myHashMap;

public class MyHashMap<K,V> {
    private static final int INIT_BUCKET_COUNT = 16;
    private Bucket[] buckets;
    class Entity{
        K key;
        V value;
    }
    class Bucket<K,V>{
        Node head;
        class Node{
            Node next;
            Entity value;
        }
        public V add(Entity entity){
            Node node = new Node();
            node.value = entity;
            if(head == null){
                head = node;
                return null;
            }
            Node current = head;
            while (true){
                if(current.value.key.equals(entity.key)){
                    V temp = (V)current.value.value;
                    current.value.value = entity.value;
                    return temp;

                }
                if(current.next != null){
                    current = current.next;
                }
                else{
                    current.next = null;
                    return null;
                }
            }
        }
        public V get(K key){
            Node node = head;
            if(head == null){
                return null;
            }else{
                while (node != null){
                    if(node.value.key.equals(key)){
                        return (V)node.value.value;
                    }
                    node = node.next;
                }
            return null;
            }
        }
    }
    public MyHashMap() {
        buckets = new Bucket[INIT_BUCKET_COUNT];
    }
    public MyHashMap(int count) {
        buckets = new Bucket[count];
    }
    private int calculateIndex(K key){
        return Math.abs(key.hashCode())%buckets.length;
    }
    public V put(K key, V value){
        int index = calculateIndex(key);
        Bucket bucket = buckets[index];
        if(bucket==null){
            bucket = new Bucket();
            buckets[index] = bucket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;

        return (V)bucket.add(entity);
    }
    public V get(K key){
        int index = calculateIndex(key);
        Bucket bucket = buckets[index];
        if(bucket==null){
            return null;
        }else{
            return (V)bucket.get(key);
        }
    }
}
