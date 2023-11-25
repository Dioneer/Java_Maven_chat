package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8081); Socket socket = serverSocket.accept();
            DataInputStream dis= new DataInputStream(socket.getInputStream());
            DataOutputStream dos= new DataOutputStream(socket.getOutputStream())){
            System.out.println("Client: "+ dis.readUTF());
            dos.writeUTF("Hi from server");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
