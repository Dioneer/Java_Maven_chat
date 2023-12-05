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
    }
}
