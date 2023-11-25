package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1", 8081); DataInputStream dis= new DataInputStream(socket.getInputStream());
            DataOutputStream dos= new DataOutputStream(socket.getOutputStream()); Scanner scanner = new Scanner(System.in)){
            while (true){
                System.out.println("Print your your message: ");
                String message = scanner.nextLine();
                dos.writeUTF(message);
                dos.flush();
                System.out.println("Income: "+dis.readUTF());
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
