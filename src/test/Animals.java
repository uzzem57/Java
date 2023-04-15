package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public  class Animals {
    private int id;
    public Animals(){

    };
    public Animals(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void animalsEating(){
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}


