package builder.classic;

public class ProgrammerTest {
    public static void main(String[] args) {
        Director director = new Director();
        MyBuilder builder = new ProgrammerBuilder();
        builder = director.createJunior(builder);
        builder.setFirstName("Ivan");
        System.out.println(builder.createBuilder());
    }
}
