package nullPionter;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Vasya", 12);
        Client client2 = new Client("Petya", 14);
        Client client3 = new Client("Misha", 13);
        List<Client> arr = new ArrayList<>();
        arr.add(client1);arr.add(client2);arr.add(client3);
        Optional<Client> find = findByName(arr, "Vasya");
        find.ifPresent(System.out::println);
        setName(client1, "Vasya");
    }
    public static void setName(Client client, String name){
        client.setName(name);
    }
    public static Optional<Client> findByName(List<Client> arr, String name){
        for (Client item: arr){
            if(item.name.equals(name)){
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
}
