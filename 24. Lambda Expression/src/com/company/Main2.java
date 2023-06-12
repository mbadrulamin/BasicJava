package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){

        List<String> nameList = new ArrayList<>();
        nameList.add("Bonni");
        nameList.add("Paulo");
        nameList.add("James");
        nameList.add("Denise");
        nameList.add("Chuck");
        nameList.add("Gina");

        //Using lambda
        nameList.forEach(
                (names) -> System.out.println(names)
        );

        //Using advance for loop
//        for (String names : nameList){
//            System.out.println(names);
//        }

    }
}
