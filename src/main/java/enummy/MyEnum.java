package enummy;

import java.util.ArrayList;
import java.util.List;

public class MyEnum {
    public void method(String dayOfWeek){
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
//        MyEnum e = new MyEnum();
//        e.method(String.valueOf(Weekdays.Tuesday));
        Today day = new Today(Weekdays.Friday);
        day.daysInfo();
        Weekdays[] arr = Weekdays.values();
        ArrayList<Weekdays> arr2 = new ArrayList<>(List.of(Weekdays.values()));
        System.out.println(arr2);
    }
}
class Today{
    Weekdays weekdays;
    public Today(Weekdays weekdays){
        this.weekdays = weekdays;
    }
    public void daysInfo(){
        switch (weekdays){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Today is " + weekdays.getMood() + " " + weekdays);
                System.out.println("Go to the work!");
                break;
                case Saturday:
            case Sunday:
                System.out.println("Stay at home!");

        }
    }
}