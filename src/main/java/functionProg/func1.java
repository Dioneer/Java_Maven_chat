package functionProg;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
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

        forEach(clients, c->c.setSum(c.getSum()-2));
        print(clients);
        print(map(clients, new Action2<Client, Object>() {

            @Override
            public Object apply(Client arg) {
                return arg.getName();
            }
        }));
        print(filter(clients, Client::isActive));
        System.out.println(find(clients, c->c.getName().endsWith("ur")));
        System.out.println(fold(clients, 0, (arg1, arg2)->arg1.getSum()+arg2));
    }

    public static <L> void forEach(List<L> list, Action1<L> action1){
        for (L item : list){
            action1.apply(item);
        }
    }
    public static <X,Y> List<Y> map(List<X> list, Action2<X,Y> mapFunction){
        ArrayList<Y> result = new ArrayList<>();
        for(X item: list){
            result.add(mapFunction.apply(item));
        }
        return result;
    }

    public static <L> List<L>  filter(List<L> list, Action2<L,Boolean> action1){
        ArrayList<L> result = new ArrayList<>();
        for (L item : list){
            if(action1.apply(item)){
                result.add(item);
            }
        }
        return result;
    }
    public static <L> L find(List<L> list, Action2<L,Boolean> action1){
        for (L item : list){
            if(action1.apply(item)){
                return item;
            }
        }
        return null;
    }
    public static <X,Y> Y fold(List<X> list, Y inivalue, Action3<X,Y,Y> action3){
        Y result = inivalue;
        for(X item: list){
            result = action3.apply(item, result);
        }
        return result;
    }

    public static <L> void print(List<L> list){
        for (L item : list){
            System.out.println(item);
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