package onlineStore;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBase {
    private static HashMap<String,Integer> visitors = new HashMap<>();

    public static HashMap<String, Integer> getVisitors() {
        return visitors;
    }

    public static void setVisitors(String name, Integer password) {


        if(visitors.containsKey(name)){
            System.out.println("Error!! This nickname is already in our DataBase!! Please, enter another name!!");
        } else {
            visitors.put(name,password);
        }
    }
}
