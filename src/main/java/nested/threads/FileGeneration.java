package nested.threads;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class FileGeneration implements Callable<List<String>> {

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> fileList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String fileName = "d://"+threadName+"_"+i+".txt";
            fileList.add(fileName);
            try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName))){
                bos.write(("Java"+i).getBytes());
                bos.flush();
            }
        }
        Thread.sleep(1000);
        return fileList;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<List<String>> gener = new FileGeneration();
            Future<List<String>> future = pool.submit(gener);
            set.add(future);
        }
        List<String> result = new ArrayList<>();
        for (Future<List<String>> f : set){
            result.addAll(f.get());
        }
        System.out.println(result);
        pool.shutdown();
    }
}
