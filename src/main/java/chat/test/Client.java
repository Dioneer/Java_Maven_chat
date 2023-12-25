package chat.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
       try(Socket socket = new Socket("127.0.0.1",8081);
           DataInputStream dis = new DataInputStream(socket.getInputStream());
           DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
           Scanner scanner = new Scanner(System.in)){
           while(true){
               System.out.println("Enter message for server: ");
               String str = scanner.nextLine();
               dos.writeUTF(str);
               dos.flush();
               System.out.println("Income message: " + dis.readUTF());
           }

       }catch (IOException ex){
           System.out.println(ex.getMessage());
       }
    }
}
