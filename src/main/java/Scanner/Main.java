package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entre integer: ");
//        int i = scanner.nextInt();
//        System.out.println(i);
        Scanner scan1 = null;
        Set<String> arr= new TreeSet<>();
        scan1 = new Scanner(new FileReader(new File("src/main/java/resources/index.html")));
//        scan1.useDelimiter("\\W");
        while (scan1.hasNext()){
            String word = scan1.next();
            arr.add(word);
        }
        System.out.println(arr);
    }
}
