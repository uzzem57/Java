package OOP.hw5;

import java.util.HashMap;
import java.util.Map;

public class UserAdd {
    static HashMap<String, Double> baseUser = new HashMap<String, Double>();
    public static void userAdd(String name, double balance){
        baseUser.put(name,balance);

    }
    static void printer(){
        for (Map.Entry<String, Double> entry : baseUser.entrySet())
            System.out.println(entry.getKey() + " => " + entry.getValue());
    }


}
