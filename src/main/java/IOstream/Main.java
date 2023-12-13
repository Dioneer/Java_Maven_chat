package IOstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
//        readFile();
        genFile();
    }

    public static void readFile(){
        try(BufferedReader fin = new BufferedReader(new FileReader("d://Main.java"))){
            String s;
            StringBuffer stringBuffer = new StringBuffer();
            while((s=fin.readLine()) != null){
                System.out.println(s);
                stringBuffer.append(s);
            }
            System.out.println(stringBuffer);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void genFile() throws IOException {
        File f = new File("d:/test");
        f.mkdir();
        for (int i = 0; i < 10; i++) {
            File f2 = new File("d:/test/"+i+".txt");
            f2.createNewFile();
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f2))){
                dos.write(("Java" + i).getBytes(StandardCharsets.UTF_8));
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        for (File ff : f.listFiles()){
           try(DataInputStream dis = new DataInputStream( new FileInputStream(ff))){
               int i = -1;
               while((i= dis.read())!=-1){
                   if((char)i=='7'){
                       System.out.println(ff);
                       return;
                   }
               }
           }catch(IOException e){
               System.out.println(e.getMessage());
           }
        }
    }
}
