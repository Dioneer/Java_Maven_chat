package enummy;

public class Color {
    public static void main(String[] args) {
        System.out.printf("%h%n", Colors.RED.getColor());
    }
}
enum Colors{
    RED(0xFFFF0000),GREEN(0xFF00FF00),BLUE(0XFF0000FF);
    private final int value;
    public int getColor(){return value;}
    Colors(int value) {
        this.value = value;
    }
}
