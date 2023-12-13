package threads;

public class ThreadExample extends Thread{
    private final String name;
    public ThreadExample(String name) {this.name = name;}

    @Override
    public void run() {
        System.out.println("Thread name is: " + this.name);
    }

    public static void main(String[] args) {
        ThreadExample threadExample1 = new ThreadExample("Stream 1");
        threadExample1.setPriority(Thread.MAX_PRIORITY);
        threadExample1.start();
        ThreadExample threadExample2 = new ThreadExample("Stream 2");
        threadExample2.setPriority(Thread.NORM_PRIORITY);
        threadExample2.start();
        ThreadExample threadExample3 = new ThreadExample("Stream 3");
        threadExample2.setPriority(Thread.MIN_PRIORITY);
        threadExample3.start();
    }
}
