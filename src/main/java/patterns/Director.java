package patterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Director {
    private static volatile Director director;
    private String sign;
    private Director(String sign) {
        this.sign = sign;
    }
    public static Director getDirector(String sign){
        if(director==null){
            synchronized (Director.class){
                if(director==null){
                    director = new Director(sign);
                }
            }
        }
        return director;
    }
    public void sign(){
        System.out.println(sign);
    }
}
class Main2{
    public static void main(String[] args) {
        Director director1 = Director.getDirector("5");
//        director1.sign();
        Director director2 = Director.getDirector("6");
//        director2.sign();
        Thread t = new Thread(director1::sign);
        Thread t2 = new Thread(director1::sign);
        t2.start();t.start();
    }
}