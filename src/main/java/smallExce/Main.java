package smallExce;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        Scanner sc = new Scanner(System.in);
//        String s = "";
//        String s2 = "";
//        System.out.println("Enter two words: ");
//            while (sc.hasNext()) {
//                s = sc.nextLine();
//                if (sc.nextLine().equals("exit")) {
//                    break;
//                }
//            }
//            System.out.println("Enter one word: ");
//            while (sc.hasNext()) {
//                s2 = sc.nextLine();
//                if (sc.nextLine().equals("exit")) {
//                    break;
//                }
//        }
//        sc.close();
//
//        int i = s.indexOf(" ");
//        String subS = s.substring(i+1);
//        if(subS.equals(s2)){
//            System.out.println("Not need to change");
//        }else{
//            s = s.substring(0, i+1) + s2;
//        }
//        System.out.println(s);
        String s = "hello";
        byte[] b = s.getBytes("UTF-16");
        System.out.println(Arrays.toString(b));
        System.out.println(new String(b, "UTF-16"));
    }


}
