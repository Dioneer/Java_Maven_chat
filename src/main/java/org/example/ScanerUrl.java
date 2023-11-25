package org.example;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ScanerUrl {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new URL("https://ya.ru").openStream());
        String text = "";
        while (scanner.hasNext()){
            text += scanner.nextLine();
        }
        System.out.println(text);
    }
}
