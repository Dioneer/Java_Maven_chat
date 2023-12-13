package smallExce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Start {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.voice();
//        Dog dog = new Dog("RRRRR", 5);
//        dog.voice(5);
//        getVoice(new Cat());
//        getVoice(new Dog());
//        Pair<Day, Integer> item1 = new Pair<>(Day.Monday, 8);
//        Pair<Day, Integer> item2 = new Pair<>(Day.Thuesday, 8);
//        Pair<Day, Integer> item3 = new Pair<>(Day.Wednesday, 8);
//        Pair<Day, Integer> item4 = new Pair<>(Day.Thursday, 8);
//        Pair<Day, Integer> item5 = new Pair<>(Day.Friday, 8);
//        List<Pair<Day, Integer>> arr = new ArrayList<>();
//        arr.add(item1);arr.add(item2);arr.add(item3);arr.add(item4);arr.add(item5);
//        System.out.println(item1.getKey().isWork());
//        System.out.println(arr);
//        ==========================================================
        User user1 = new User("Igor", "123456");
        User user2 = new User("Igor", "123456");
        User user3 = new User("Mirra", "123456");
        User user4 = new User("Kirra", "123456");
        User user6 = new User("Igor", "1234567");
        User user5 = new User("Lora", "123456");
        Manager manager = new Manager();
        manager.addUser(user1);
        manager.addUser(user2);
        manager.addUser(user3);
        manager.addUser(user4);
        manager.addUser(user5);
        manager.addUser(user6);
        manager.showUsers();
        manager.login("Loraa", "123456");
        manager.delUser("Lora");
        manager.showUsers();
        manager.sortedUsers("login");
        manager.sortedUsers("date");
    }
    public static void getVoice(Animal animal){
        animal.voice();
    }
}
