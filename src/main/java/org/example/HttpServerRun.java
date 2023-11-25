package org.example;

public class HttpServerRun {
    public static void main(String[] args) {
        HTTPServer httpServer = new HTTPServer(8082, 5);
        httpServer.run();
    }
}
