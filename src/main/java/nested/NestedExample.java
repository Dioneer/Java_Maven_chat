package nested;

public class NestedExample {
    public static void main(String[] args) {
/**
 * nested start
 */     StaticNested.Engine e= new StaticNested.Engine(150);
        StaticNested car = new StaticNested("Blue", 4, e);
        System.out.println(car);
/**
 * nested end
 */
/**
 * inner start
 */
        InnerNested in = new InnerNested("Red", 4,200 );
        in.new Engine(400);
        InnerNested in2 = new InnerNested("Red", 4);
        InnerNested.Engine engine = in2.new Engine(400);
        in2.setEngine(engine);
        System.out.println(in);
        System.out.println(in2);
        System.out.println(engine);
/**
 * inner end
 */
/**
 * local start
 */
        LocalNested localNested = new LocalNested();
        localNested.getResult();
/**
 * local end
 */
    }
}
