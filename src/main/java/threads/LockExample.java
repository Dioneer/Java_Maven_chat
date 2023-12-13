package threads;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        Thread t1 = new Thread(new CountThread(commonResource, locker));
        t1.setName("Thread "+1);
        Thread t2 = new Thread(new CountThread(commonResource, locker));
        t2.setName("Thread "+2);
        Thread t3 = new Thread(new CountThread(commonResource, locker));
        t2.setName("Thread "+3);
        t1.start();
        t2.start();
        t3.start();
    }
}
class CommonResource{
    int x = 0;

}
class CountThread implements Runnable{
    private CommonResource commonResource;
    private ReentrantLock locker;

    public CountThread(CommonResource commonResource, ReentrantLock locker) {
        this.commonResource = commonResource;
        this.locker = locker;
    }
    public void run(){
        locker.lock();
        try{
        commonResource.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + commonResource.x);
                commonResource.x++;
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}