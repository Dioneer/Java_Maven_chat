package smallExce;

import java.util.*;

public class Manager {
    private final Map<UUID, User> users;

    public Manager() {
        users = new HashMap<>();
    }

    public void addUser(User user){
        List<User> arr = new ArrayList<>(users.values());
        boolean flag = true;
        if(!arr.isEmpty()) {
            for (User person : arr) {
                if (person.getLogin().equals(user.getLogin())) {
                    flag = false;
                }
            }
            if(flag){
                System.out.println("Welcome " + user.getLogin());
                users.put(UUID.randomUUID(), user);
            }else{
                System.out.println("This login " + user.getLogin() + " already exists");
            }
        }
        else{
            System.out.println("Welcome " + user.getLogin());
            users.put(UUID.randomUUID(), user);
        }
    }
    public void login(String login, String password){
        List<User> logAndPass = new ArrayList<>(users.values());
        if(!logAndPass.isEmpty()) {
            for (User user : logAndPass) {
                if(user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    System.out.println("Welcome!");
                    return;
                }
            }
            for (User user : logAndPass) {
                if (user.getLogin().equals(login)) {
                    System.out.println("Your pass is not correct");
                    return;
                }
            }
            System.out.println("Your login is not correct");
        }
    }
    public void delUser(String login){
        List<User> log= new ArrayList<>(users.values());
        User del = null;
        for (User user : log) {
            if(user.getLogin().equals(login)){
                del = user;
            }
        }
        User finalDel = del;
        users.entrySet().removeIf(i-> i.getValue().equals(finalDel));
    }
    public void showUsers(){
           for(Map.Entry<UUID, User> item: users.entrySet()){
               System.out.println(item);
        }
    }
    public void sortedUsers(String type){
        List<User>arr = new ArrayList<>(users.values());
        switch (type) {
            case "login":
                arr.sort(new LoginComparator());
                System.out.println(arr);
                break;
            case "date":
                arr.sort(new DataComparator());
                System.out.println(arr);
                break;
        }
    }

}
