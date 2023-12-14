package dataWork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PeriodClasses {
    public static void main(String[] args) {
       LocalDate today = LocalDate.now();
       LocalDate spec = LocalDate.of(2023,12,13);
        System.out.println(spec.format(DateTimeFormatter.ofPattern("dd:MM:yyyy")));
        LocalDate day = LocalDate.ofYearDay(2017, 333);
        System.out.println(today+" "+spec+" "+day);
        System.out.println(today.minusYears(spec.getYear()).getYear());
    }
}
