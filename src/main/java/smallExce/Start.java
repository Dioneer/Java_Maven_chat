package smallExce;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        Dog dog = new Dog("RRRRR", 5);
        dog.voice(5);
        getVoice(new Cat());
        getVoice(new Dog());
    }
    public static void getVoice(Animal animal){
        animal.voice();
    }
}
