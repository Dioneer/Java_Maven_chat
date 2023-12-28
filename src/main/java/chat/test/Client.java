package chat.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
                try(Socket socket = new Socket("127.0.0.1", 8081);
                    DataInputStream dis = new DataInputStream(socket.getInputStream());
                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    Scanner scanner = new Scanner(System.in)){
                    while (true){
                        System.out.println("Input your message: ");
                        String answer = scanner.nextLine();
                        dos.writeUTF(answer);
                        dos.flush();
                        String str = dis.readUTF();
                        System.out.println("Answer from server message: " + str);
                    }
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
    }
}
