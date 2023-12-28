package http.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private final int STANDART_PORT = 8081;
    private final int port;

    private final ExecutorService executorService;

    public Server(int port, int count) {
        this.port = port;
        executorService = Executors.newFixedThreadPool(count);
    }
    public Server() {
        this.port = STANDART_PORT;
        executorService = Executors.newFixedThreadPool(8);
    }

    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while(true){
                Socket socket = serverSocket.accept();
                executorService.submit(()->process(socket));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void process(Socket socket) {
        try(socket; DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        FileInputStream fis = new FileInputStream("src/main/resources/index.html")){
            Thread.sleep(1000);
            int size = dis.available();
            String str = new String(dis.readNBytes(size));
            System.out.println(str);
            byte[] arr = fis.readAllBytes();
            dos.write("""
                    HTTP/1.1 200 OK
                    content-type: text/html
                    content-length: %s
                    """.formatted(arr.length).getBytes());
            dos.write(System.lineSeparator().getBytes());
            dos.write(arr);
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
