package threads;

public class DeadLock {
    static class Fried{
        private final String name;

        public Fried(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public synchronized  void bow(Fried bower){
            System.out.println(name+" has dowed to " + bower.getName());
            bower.bowback(this);
        }
        public synchronized  void bowback(Fried bower){
            System.out.println(name+" has dowed back to " + bower.getName());
        }
    }

    public static void main(String[] args) {
        final Fried alspons = new Fried("Alphonse");
        final Fried gaston= new Fried("Gaston");
        new Thread(() -> alspons.bow(gaston)).start();
        new Thread(() -> gaston.bow(alspons)).start();
    }
}
