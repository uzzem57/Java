package OOP.hw5;

import java.util.HashMap;

public class User {
    private double balance;
    private String name;


    public User( String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {

        return balance;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}