package smallExce;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class DataComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ld1 = LocalDateTime.parse(o1.getDateTime(), formatter);
        LocalDateTime ld2 = LocalDateTime.parse(o2.getDateTime(), formatter);
        return ld1.compareTo(ld2);
    }
}
