package warehouse;

public class Store {
    private int item;
    public synchronized void put() throws InterruptedException {
        while (item > 4){
            wait();
        }
        item++;
        System.out.println("Producer add 1 item. There are "+ item + " in stock");
        notify();
    }
    public synchronized void get() throws InterruptedException {
        while (item<1){
            wait();
        }
        item--;
        System.out.println("Consumer get 1 item. There are "+ item + " in stock");
        notify();
    }
}
