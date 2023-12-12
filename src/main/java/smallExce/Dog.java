package smallExce;

public class Dog extends Animal{
    private String angry;
    private int number;

    public Dog(String angry, int number) {
        this.angry = angry;
        this.number = number;
    }

    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }
    public void voice(String angry) {
        System.out.println(angry);
    }
    public void voice(int number) {
        System.out.println(number);
    }
}
