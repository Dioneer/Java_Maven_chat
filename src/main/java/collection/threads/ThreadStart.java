package collection.threads;

public class ThreadStart {
    public static void main(String[] args) {
        /**
         * synchro
         */
//        System.out.println("HI");
//        for (int i = 0; i <10; i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println("BY");
        /**
         *multi
         */
        MyThread mt1 = new MyThread();
        mt1.start();
        MyThread2 mt2 = new MyThread2();
        mt2.start();
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.print(i+" ");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 50; i <= 100; i++) {
            System.out.print(i+" ");
        }
    }
}
