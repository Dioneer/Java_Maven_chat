package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HTTPServer implements Runnable{
    private final int port;
    private final ExecutorService executorService;
    public HTTPServer(int port, int poolSize){
        this.port = port;
        executorService = Executors.newFixedThreadPool(poolSize);
    }
    public void run() {
        try{
            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();
            while (true) {
                executorService.submit(()->processSocket(socket));
            }
            }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private void processSocket(Socket socket) {
        try(DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
            Thread.sleep(1000);
            System.out.println(new String(dis.readNBytes(200)));
            byte[] body = Files.readAllBytes(Path.of("src/main/java/resources/index.html"));
            dos.write("""
                    HTTP/1.1 200 OK
                    content-type: text/html
                    content-length: %s
                    """.formatted(body.length).getBytes());
            dos.write(System.lineSeparator().getBytes());
            dos.write(body);
        }catch(IOException e){
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
