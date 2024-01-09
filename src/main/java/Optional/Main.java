package Optional;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//    Client client = null;
//    setName(client,"Vasya");
//    }
//    public static void setName(@NotNull Client client, String name){
//        client.setName(name);
//    }
       final List<Client> arr = new ArrayList<>();
        arr.add(new Client("Vasya"));
        arr.add(new Client("Petya"));
        arr.add(new Client("Kolya"));
        Client client = findByName(arr, "Vasya").get();
        Optional<Client> client1 = findByName(arr, "Vasya");
        client1.ifPresent(c-> System.out.println(c.toString()));
    }
    static Optional<Client> findByName(List<Client> clients, String name){
        for(Client client:clients){
            if(name.equals(client.getName())){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
    public static class SuperList<T>{
        final List<T> internalList = new ArrayList<>();
        public SuperList(List<T> internalList){
            this.internalList.addAll(internalList);
        }
    }
    public Optional<Client> findEvent(String id){
        Client result = null;
        return Optional.ofNullable(result);
    }
}
@Getter
class Client{
    String name;

    public Client(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}