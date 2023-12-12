package smallExce;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterr {
    public static void main(String[] args) {
        String test = "123 123123456 456 123123456123";
        Pattern p = Pattern.compile("[0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(test);
        int mathLength = -1;
        while (matcher.find()){
            if(mathLength < matcher.end()-matcher.start()){
                mathLength = matcher.end()-matcher.start();
            }
//            System.out.println(test.substring(matcher.start(), matcher.end()));
        }
        System.out.println(mathLength);
    }
}
