package chat.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8081)){
            while (true) {
                Runnable runnable= ()-> {
                    try (Socket socket = serverSocket.accept();
                         DataInputStream dis = new DataInputStream(socket.getInputStream());
                         DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                         Scanner scanner = new Scanner(System.in)) {
                        String st = dis.readUTF();
                        while (!st.equals("close")) {
                            System.out.println("Income message: " + st + " Thred: "+Thread.currentThread().getName());
                            System.out.println("Server answer: ");
                            String answer = scanner.nextLine();
                            dos.writeUTF(answer);
                            dos.flush();
                            st = dis.readUTF();
                        }
                    }catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }
                };
                ExecutorService poll = Executors.newCachedThreadPool();
                poll.submit(runnable);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
