package OOP.hw5;

import org.w3c.dom.ls.LSOutput;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Петров",100.00);
        UserAdd.userAdd(user1.getName(), user1.getBalance());
        User user2 = new User("Иванов", 200.00);
        UserAdd.userAdd(user2.getName(), user2.getBalance());

        UserDelete.userDelete("Иванов");

        MoneyAdd.balanceAdd("Петров",50.0);
        MoneyDel.balanceDel("Петров", 100.0);


        UserAdd.printer();
    }
}
