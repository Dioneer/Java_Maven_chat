package patterns;

public final class SingleTone {
    private static volatile SingleTone single;

    private SingleTone() {
    }
    public static SingleTone getInstance(){
        if(single==null){
            synchronized (SingleTone.class){
                if(single==null){
                    single = new SingleTone();
                }
            }
        }
        return single;
    }
}
