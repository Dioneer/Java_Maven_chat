package http;

import lombok.AllArgsConstructor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    private final int port;
    private final ExecutorService executorService;

    public HttpServer(int port, int size) {
        this.port = port;
        this.executorService = Executors.newFixedThreadPool(size);
    }

    public void run() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Socket accepted");
            executorService.submit(() -> processSocket(socket));
        }
    }

    private void processSocket(Socket socket) {
        try(socket; DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
            Thread.sleep(1000);
            String str = new String(dis.readNBytes(400));
            System.out.println(str);
            byte[] bytes = Files.readAllBytes(Path.of("src/main/resources/index.html"));
            dos.write(
                    """
                            HTTP/1.1 200 OK
                            content-type: text/html
                            content-length: %s
                            """.formatted(bytes.length).getBytes());
            dos.write(System.lineSeparator().getBytes());
            dos.write(bytes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
