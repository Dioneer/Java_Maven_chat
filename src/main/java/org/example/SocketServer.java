package org.example;

import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8081); Socket socket = serverSocket.accept();
            DataInputStream dis= new DataInputStream(socket.getInputStream());
            DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in)){
            String requst = dis.readUTF();
            while(!requst.equals("exit")){
                System.out.println("Income: " + requst);
                System.out.println("Enter your message: ");
                String message = scanner.nextLine();
                dos.writeUTF(message);
                dos.flush();
                requst = dis.readUTF();
                }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
