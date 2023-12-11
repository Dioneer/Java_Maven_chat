package nullPionter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Client {
    String name;
    int age;
    String date;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
        this.date = new SimpleDateFormat("yyyy:MM:dd:kk:mm:ss").format(Calendar.getInstance().getTime());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
