package exception;

public class Main {
    public static void main(String[] args) {
        int i = 1;
         int j = 1;
         try{
           int res = i/j;
             System.out.println(res);
         }catch(Exception e){
             System.out.println(e.getMessage());
             System.out.println("run");
        }
    }
}
