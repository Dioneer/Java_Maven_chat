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
        forEach(clients, (c-> c.setSum(c.getSum()-10)));

    }
    public static <K> void forEach(ArrayList<K> clients, Action1<K> action1){
        for (K item: clients){
           action1.apply(item);
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