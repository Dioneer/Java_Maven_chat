package functionProg;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class func1 {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(new Client("Igor",15, true));
        clients.add(new Client("Rimma",5, true));
        clients.add(new Client("Dori",8, true));
        clients.add(new Client("Nori",55, true));
        clients.add(new Client("Biffur",6, true));
        clients.add(new Client("Boffur",9, true));
        forEach(clients, (c-> c.setSum(c.getSum()-10)));
        clients.stream().forEach(System.out::println);
        System.out.println(map(clients, Client::getName));
        System.out.println(filter(clients, c->c.getSum()>5));
        print(map(filter(clients, c->c.getSum()>=5), Client::getName));
        System.out.println(find(clients, c->c.getSum()==5));
        print(Collections.singleton(fold(clients, 0, (Client client, Integer sum) -> client.getSum()+sum)));
    }

    public static <K> void forEach(ArrayList<K> clients, Action1<K> action1){
        for (K item: clients){
           action1.apply(item);
        }
    }
    public static <K,M> List<M> map(List<K> list, Action2<K,M> action2){
        ArrayList<M> arr = new ArrayList<>();
        for(K item: list){
            arr.add(action2.apply(item));
        }
        return arr;
    }
    public static <K> List<K> filter(List<K> list, Action2<K,Boolean> action2){
        ArrayList<K> arr = new ArrayList<>();
        for(K item: list){
            if(action2.apply(item)) {
                arr.add(item);
            }
        }
        return arr;
    }
    public static <K> K find(List<K> list, Action2<K,Boolean> action2){
        for(K item: list){
            if(action2.apply(item)) {
                return item;
            }
        }
        return null;
    }
    public static <K, Y> Y fold(List<K> list, Y initValue, Action3<K,Y,Y> action3){
        Y result = initValue;
        for(K item: list){
            result = action3.apply(item, result);
            }
        return result;
    }
    private static void print(Collection<Object> items){
        for(Object item:items){
            System.out.println(item.toString());
        }
    }
}
@Getter
@Setter
class Client {
    private String name;
    private int sum;
    private boolean isActive;

    public Client(String name, int sun, boolean isActive) {
        this.name = name;
        this.sum = sun;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", sun=" + sum +
                ", isActive=" + isActive +
                '}';
    }
}