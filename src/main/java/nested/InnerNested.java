package nested;

public class InnerNested {
    private String color;
    private int doorCount;
    private Engine engine;

    public InnerNested (String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }
    public InnerNested (String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public class Engine{
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
