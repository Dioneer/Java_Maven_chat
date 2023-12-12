package smallExce;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        Dog dog = new Dog("RRRRR", 5);
        dog.voice(5);
        getVoice(new Cat());
        getVoice(new Dog());
        Pair<Day, Integer> item1 = new Pair<>(Day.Monday, 8);
        Pair<Day, Integer> item2 = new Pair<>(Day.Thuesday, 8);
        Pair<Day, Integer> item3 = new Pair<>(Day.Wednesday, 8);
        Pair<Day, Integer> item4 = new Pair<>(Day.Thursday, 8);
        Pair<Day, Integer> item5 = new Pair<>(Day.Friday, 8);
        List<Pair<Day, Integer>> arr = new ArrayList<>();
        arr.add(item1);arr.add(item2);arr.add(item3);arr.add(item4);arr.add(item5);
        System.out.println(item1.getKey().isWork());
        System.out.println(arr);
    }
    public static void getVoice(Animal animal){
        animal.voice();
    }
}
