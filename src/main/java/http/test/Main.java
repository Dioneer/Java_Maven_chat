package http.test;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(8082, 8);
        server.run();
    }
}
