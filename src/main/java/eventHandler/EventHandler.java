package eventHandler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class EventHandler implements Callable<String> {
    private LocalDateTime eventDate;

    public EventHandler(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String call() throws Exception {
        long d = 0;
        while((d = Duration.between(eventDate, LocalDateTime.now()).toSeconds())<=0){
            System.out.println("Event: " + Thread.currentThread().getName()+ " will started in " + d + " seconds");
            Thread.sleep(1000);
        }
        return "Event: " + Thread.currentThread().getName() +" started";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        LocalDateTime data = LocalDateTime.now();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 4; i <= 25; i++) {
            if(i%5==0){
                Callable<String> callable = new EventHandler(data.plusSeconds(i));
                Future<String> result = pool.submit(callable);
                System.out.println(result.get());
            }
        }
//        Callable<String> callable1 = new EventHandler(data.plusSeconds(5));
//        Callable<String> callable2 = new EventHandler(data.plusSeconds(10));
//        Callable<String> callable3 = new EventHandler(data.plusSeconds(15));
//        Callable<String> callable4 = new EventHandler(data.plusSeconds(20));
//        Callable<String> callable5 = new EventHandler(data.plusSeconds(25));
//        Future<String> result1 = pool.submit(callable1);
//        Future<String> result2 = pool.submit(callable2);
//        Future<String> result3 = pool.submit(callable3);
//        Future<String> result4 = pool.submit(callable4);
//        Future<String> result5 = pool.submit(callable5);
//        System.out.println(result1.get());
//        System.out.println(result2.get());
//        System.out.println(result3.get());
//        System.out.println(result4.get());
//        System.out.println(result5.get());
        pool.shutdown();
    }
}
