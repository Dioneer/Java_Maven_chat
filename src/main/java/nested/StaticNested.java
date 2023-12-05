package nested;

public class StaticNested {
    private static String color;
    private static int doorCount;
    private Engine engine;

    public StaticNested(String color, int doorCount, Engine engine) {
        StaticNested.color = color;
        StaticNested.doorCount = doorCount;
        this.engine = engine;
    }

    public static class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }
        @Override
        public String toString() {
            return "Engine of my car:{" +
                    "engine=" + horsePower +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
}
class Z extends StaticNested.Engine{
    public Z(int horsePower) {
        super(horsePower);
    }
}