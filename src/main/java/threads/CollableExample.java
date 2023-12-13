package threads;

import java.security.PrivateKey;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.*;

public class CollableExample implements Callable<Integer> {
    private String word;
    public CollableExample(String word) {
        this.word = word;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println("Word length is: " + word.length());
        return Integer.valueOf(word.length());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        ExecutorService pool = Executors.newFixedThreadPool(4);
        Set<Future<Integer>> set = new HashSet<>();
        for (String word : str){
            Callable<Integer> callable = new CollableExample(word);
            Future<Integer> future = pool.submit(callable);
            set.add(future);
        }
        int sum = 0;
        for (Future<Integer> item : set){
            sum+=item.get();

        }
        System.out.println(sum);
        pool.shutdown();
    }
}
