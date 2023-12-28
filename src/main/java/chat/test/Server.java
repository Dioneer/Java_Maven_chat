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
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            while (true) {
                Runnable runnable = (() -> {
                    try (Socket socket = serverSocket.accept();
                         DataInputStream dis = new DataInputStream(socket.getInputStream());
                         DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                         Scanner scanner = new Scanner(System.in)) {
                        String s = dis.readUTF();
                            while (!s.equals("close")) {
                                System.out.println("Message from user: " + s);
                                System.out.println("Input your answer to client: ");
                                String answer = scanner.nextLine();
                                dos.writeUTF(answer);
                                dos.flush();
                                s = dis.readUTF();
                            }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                ExecutorService pool = Executors.newFixedThreadPool(10);
                pool.submit(runnable);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
