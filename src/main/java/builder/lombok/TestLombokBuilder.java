package builder.lombok;

public class TestLombokBuilder {
    public static void main(String[] args) {
        Builder2 builder2 = Builder2.builder()
                .age(32)
                .lastName("Pegov")
                .firstName("Petr")
                .build();
        System.out.println(builder2);
    }
}
