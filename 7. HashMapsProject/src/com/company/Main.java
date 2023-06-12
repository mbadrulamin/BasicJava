package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //HashMap (key --> value)

        HashMap user = new HashMap();

        HashMap <String, Integer> newuser = new HashMap<>();

        newuser.put("Abu", 20);

        System.out.println(newuser.get("Abu"));

        user.put("Kealy", 34);
        user.put("Bonni", 25);

        if(user.equals("Holla")){
            System.out.println("Yay");
        }
        else{
            System.out.println("Nay!");
        }

        Iterator it = user.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();

            System.out.println(pair.getKey() + "=" + pair.getValue());
        }


//        System.out.println("Values: " + user.values());
//        System.out.println("Entire value: " + user.entrySet());

//        System.out.println(user.get("Kealy"));
//        System.out.println(user.get("Bonni"));

    }
}
